package com.demo.spring.service;

import javax.jws.WebService;

/**
 * 
* <b>Description:定义一个接口</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> cxf_springWeb
* <br><b>PackageName:</b> com.demo.service
* <br><b>ClassName:</b>HelloWorld.java
* <br><b>Date:</b> 2017年12月13日 下午5:24:14
 */
@WebService
public interface HelloWorld {
	public String sayHi(String name);
}
