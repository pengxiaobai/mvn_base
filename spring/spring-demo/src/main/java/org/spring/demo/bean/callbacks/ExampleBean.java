package org.spring.demo.bean.callbacks;
/**
* <b>Description:bean 的生命周期回调测试</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.initialization.callbacks
* <br><b>ClassName:</b> ExampleBean
* <br><b>Date:</b> 2018年1月1日 下午10:47:28
*/

public class ExampleBean {
	
	public ExampleBean(){
		System.out.println("我是ExampleBean的构造函数");
	}
	
	
	public void init(){
		System.out.println("我是bean生命周期回调测试方法");
	}
	
	public void say(){
		System.out.println("我在说话");
	}
	
	public void cleanup(){
		System.out.println("我是destroy方法回调测试");
	}
	
	public void say1(){
		System.out.println("我在说话 --destroy");
	}
	
}
