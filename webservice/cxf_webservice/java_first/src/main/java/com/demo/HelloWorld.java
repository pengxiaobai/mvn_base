package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> java_first
* <br><b>PackageName:</b> com.demo
* <br><b>ClassName:</b> HelloWorld
* <br><b>Date:</b> 2017年12月12日 上午12:03:34
* 
* WebService属性
* name：设置 wsdl:portType的名称,默认是接口名称
* targetNamespace:设置wsdl:targetNamespace  默认是包名称的反过来
* wsdlLocation：指定wsdl所存储的url，默认为发布时候的地址
* 
* 注意：以下几种属性不能使用在接口中，应该使用在实现类中
* serviceName:设置 wsdl:service 
* endpointInterface：指定实现类实现的SEI的完整名称。只有在服务实现类使用属性时才使用该属性。
* portName：设置 wsdl:port，默认为实现类+“Port”
*/
@WebService(name="HelloWorld1111"
,targetNamespace="http://com.demo.first"
,wsdlLocation="http://localhost:9999/helloWorldtt?wsdl")
public interface HelloWorld {
	
	//@WebParam 
	@WebMethod
	public String say(@WebParam(name="name1")String name);

}
