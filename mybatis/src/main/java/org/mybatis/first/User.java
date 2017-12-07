package org.mybatis.first;
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
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", createTime="
				+ createTime + "]";
	}
	
	
}
