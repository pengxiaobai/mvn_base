package org.mybatis.first.select.constructor;
/**
 * 
* <b>Description:用户实体类</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> mybatis
* <br><b>PackageName:</b> org.mybatis.first
* <br><b>ClassName:</b>User.java
* <br><b>Date:</b> 2017年12月7日 下午2:43:41
 */

import java.sql.Timestamp;

public class User {
	
	private int id;
	private String name;
	private int age;
	private String address;
	private Timestamp createTime;
	
	//构造器
	public User(Integer id, String name, int age,String address){
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public User(Integer id, String name, int age,String address,Timestamp timestamp){
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.createTime = timestamp;
	}
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", createTime="
				+ createTime + "]";
	}
	
	
}
