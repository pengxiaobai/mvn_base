package com.demo.log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.omg.Messaging.SyncScopeHelper;
/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> io_file
* <br><b>PackageName:</b> com.demo.log
* <br><b>ClassName:</b>dataProcessing.java
* <br><b>Date:</b> 2017年12月12日 上午11:59:32
 */
public class DataProcessing{
	//读取文件的路径
	private String rFile;
	//写文件路径
	private String wFile;
	//处理数据的规则
	private String rule;
	
	public DataProcessing(String rFile,String wFile,String rule){
		this.rFile = rFile;
		this.wFile = wFile;
		this.rule = rule;
	}
	
	/**
	 * 
	* 
	* <b>Description:</b><br> 
	* @throws Exception
	* @Exception 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月12日 下午12:25:13
	* <br><b>Version:</b> 1.0
	 */
	public void dataProcessing() throws Exception{
		if(null != rFile && !"".equals(rFile)){
			//判断输出的文件路径是否为空
			if(null == wFile || "".equals(wFile)){
				wFile = rFile.split(",")[0]+"dataProcessing";
			}
			FileReader fileReader = new FileReader(rFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			//安行读取文件
			String line = "";
			int num = 1;
			//得到数据不为空
			List<Attdance> attdances = new ArrayList<Attdance>();
			Attdance attdance = null;
			while(null != (line=bufferedReader.readLine())){
				//判断数据是否是需要的
				if(line.contains(rule)){
					String[] attStrs = line.split(";");
					attdance = new Attdance(attStrs[3], attStrs[1], attStrs[2], attStrs[4], attStrs[5]);
					attdances.add(attdance);
				}
			}
			bufferedReader.close();
			fileReader.close();
			
			//将数据保存到excel中
			if(null != attdances && 0 < attdances.size()){
				List<String> excelHear = new ArrayList<String>();
				excelHear.add("序号");
				excelHear.add("设备号");
				excelHear.add("卡号");
				excelHear.add("出入校状态");
				excelHear.add("打卡时间");
				excelHear.add("上传时间");
				createAttExcel(excelHear,attdances);
			}else{
				System.out.println("没有考勤数据需要保存");
			}
		}else{
			System.out.println("处理文件失败,读取文件为空");
		}	
	}
	
	@SuppressWarnings("unused")
	private void createAttExcel(List<String> excelHear,List<Attdance> attdances) throws Exception{
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook();
	    CreationHelper createHelper = workbook.getCreationHelper();
	    //创建新的excel页面
	    Sheet sheet = workbook.createSheet("new sheet");
	    Row row = sheet.createRow((short)0);
	    //循环处理表头
	    for(int i=0; i<excelHear.size();i++){
	    	 row.createCell(i).setCellValue(createHelper.createRichTextString(excelHear.get(i)));
	    }
	    //插入考勤数据
	    for(int i=0; i<attdances.size(); i++){
	    	row = sheet.createRow((short)(i+1));
	    	row.createCell(0).setCellValue(createHelper.createRichTextString(String.valueOf(i+1)));
	    	row.createCell(1).setCellValue(createHelper.createRichTextString(attdances.get(i).getDeviceId()));
	    	row.createCell(2).setCellValue(createHelper.createRichTextString(attdances.get(i).getCardNum()));
	    	row.createCell(3).setCellValue(createHelper.createRichTextString(String.valueOf(attdances.get(i).getStatus())));
	    	row.createCell(4).setCellValue(createHelper.createRichTextString(String.valueOf(attdances.get(i).getOperTime())));
	    	row.createCell(5).setCellValue(createHelper.createRichTextString(String.valueOf(attdances.get(i).getSubmitTime())));
	    }
	    //保存文件
	    FileOutputStream fileOut = new FileOutputStream(this.wFile+".xlsx");
	    workbook.write(fileOut);
	    fileOut.close();
	}
	
	

}
