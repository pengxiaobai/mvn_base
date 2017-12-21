package org.spring.demo.bean.instantiation.dao;
/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.instantiation.constructor.imple
* <br><b>ClassName:</b> UserDao
* <br><b>Date:</b> 2017年12月21日 下午11:07:52
*/

public class UserDao {
	private String name;
	
	public UserDao(){
		System.out.println("我是用户的数据层构造器");
	}
	
	public void say(){
		System.out.println("我是服务的数据层");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
