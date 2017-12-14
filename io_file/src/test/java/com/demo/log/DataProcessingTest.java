package com.demo.log;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> io_file
* <br><b>PackageName:</b> com.demo.log
* <br><b>ClassName:</b>DataProcessingTest.java
* <br><b>Date:</b> 2017年12月12日 下午12:21:47
 */
public class DataProcessingTest {

	@Test
	public void test() {
		String rFile = "E:/log/service.log";
		String wFile = "E:/log/外国语考勤数据整理/attdance2017-12-12";
		String rule ="send queue:==========>IO;05120110001";
		DataProcessing dataProcessing = new DataProcessing(rFile,wFile,rule);
		try {
			dataProcessing.dataProcessing();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
