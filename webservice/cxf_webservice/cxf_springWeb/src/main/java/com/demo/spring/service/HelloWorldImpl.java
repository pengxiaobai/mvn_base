package com.demo.spring.service;

import javax.jws.WebService;

/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> cxf_springWeb
* <br><b>PackageName:</b> com.demo.spring.service
* <br><b>ClassName:</b>HelloWorldImpl.java
* <br><b>Date:</b> 2017年12月13日 下午5:26:12
* 
* 
* endpointInterface：指向发布的接口
* 
 */
@WebService(endpointInterface="com.demo.spring.service.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHi(String name) {
		System.out.println("sayHi  "+name);
		return "hi "+name;
	}

}
