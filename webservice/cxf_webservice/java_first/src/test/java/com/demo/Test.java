package com.demo;


import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Test {
	private static String url  = 
			"http://www.czcardinfo.cn/AsCardAppWeb/wxController/sendTemplateMessage.action";
	private static  String openId = "ohqptt39UzH_dI_kA5R19ZmNQHaM";
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static void main(String[] args) {
		
	
		String tempMsg = "{\"data\": [{"
           +"\"color\": \"#173177\","
            +"\"name\": \"first\","
            +"\"value\": \"测试\" }, {"
            +"\"color\": \"#173177\","
            +"\"name\": \"keyword1\","
            +"\"value\": \""+sdf.format(new Date())+"\"},{"
            +"\"color\": \"#173177\","
            +"\"name\": \"keyword2\","
            +"\"value\": \""+1111+"\"},{"
            +"\"color\": \"#173177\","
            +"\"name\": \"keyword3\","
            +"\"value\": \"\"},{"
            +"\"color\": \"#173177\","
            +"\"name\": \"remark\","
            +"\"value\": \"测试1\"} ],"
            +"\"templateId\": \"k1Z7AvN9Kyt8vTjwAFOtjzSz4ecfIl9woYCwqdmRBDk\","
            +"\"toUser\": \""+openId+"\","
            +"\"topColor\": \"#FF0000\","
            +"\"url\":\"\"}";
		System.out.println("发送:"+tempMsg);
		String msg =  post(url, tempMsg);
		System.out.println(msg);
	}
	
	public static String post(String urlPath,String json){
		String msg ="";
		try{
			URL url = new URL(urlPath); 
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setReadTimeout(5*1000);
			connection.setConnectTimeout(3*1000);
//			connection.setUseCaches(false);
//			connection.setRequestProperty("charset", "utf-8");
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");		
//			connection.setRequestProperty("ContentEncoding", "utf-8");
			connection.connect();
			OutputStream os = connection.getOutputStream();
			
//			OutputStreamWriter out = new OutputStreamWriter(os, "utf-8");
//			String param = "jsonParam="+URLEncoder.encode(json, "utf-8");
//			System.out.println(connection.getContentEncoding());
			String param = "jsonParam="+json;
			os.write(param.getBytes("utf-8"));
			os.flush();
			os.close();
//			DataOutputStream outputStreamWriter  = new DataOutputStream(os); 
//			out.write("jsonParam="+json);;
//			out.flush();
//			out.close();
			InputStream is = connection.getInputStream();
	        int size =is.available();
            byte[] jsonBytes =new byte[size];
            is.read(jsonBytes);
            msg=new String(jsonBytes,"UTF-8");
		}catch (Exception e) {
			msg = "向爱索推送设备信息失败:"+e.getMessage();
		}
		return msg;
	}
}