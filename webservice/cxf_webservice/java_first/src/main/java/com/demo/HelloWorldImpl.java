package com.demo;

import javax.jws.WebService;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> java_first
* <br><b>PackageName:</b> com.demo
* <br><b>ClassName:</b> HelloWorldImpl
* <br><b>Date:</b> 2017年12月12日 上午12:13:11
*/
@WebService
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String say(String name) {
		System.out.println("你好:"+name);
		return "你好"+name;
	}

}
