package org.spring.demo.bean;
/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo
* <br><b>ClassName:</b> UserService
* <br><b>Date:</b> 2017年12月18日 下午10:10:09
*/

public class UserService {
	
	public UserService(){
		System.out.println("我是构造函数");
	}
	
	public void say(String name){
		System.out.println("你好,"+name);
	}
	


}
