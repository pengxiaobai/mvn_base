package com.demo;

import javax.xml.ws.Endpoint;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> java_first
* <br><b>PackageName:</b> com.demo
* <br><b>ClassName:</b> HelloWolrdMain
* <br><b>Date:</b> 2017年12月12日 上午12:17:07
*/

public class HelloWolrdMain {
	public static void main(String[] args) {
		
		String EndPointAdrress = "http://localhost:9999/hellowolrd";
		Endpoint.publish(EndPointAdrress, new HelloWorldImpl());
		System.out.println("发布成功");
		
	}

}
