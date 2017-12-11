package com.demo.entity;

import java.util.List;
import java.util.Map;

/**
 * 
* <b>Description:用户实体类</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> webservice
* <br><b>PackageName:</b> com.demo.entity
* <br><b>ClassName:</b>User.java
* <br><b>Date:</b> 2017年12月11日 下午2:11:56
 */
public class User {
	private int id;
	private String name;
	private int age;
	private List<String> hobbys;
	private Map<String,String> schools;
	/**
	 *
	 * @Time:2017年12月11日 下午2:54:41
	 * @Username:Peng xh
	 * @Todo:TODO
	 * @param id
	 * @param name
	 * @param age
	 * @param hobbys
	 * @param schools
	 */
	public User(int id, String name, int age, List<String> hobbys, Map<String, String> schools) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.hobbys = hobbys;
		this.schools = schools;
	}
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
	public List<String> getHobbys() {
		return hobbys;
	}
	public void setHobbys(List<String> hobbys) {
		this.hobbys = hobbys;
	}
	public Map<String, String> getSchools() {
		return schools;
	}
	public void setSchools(Map<String, String> schools) {
		this.schools = schools;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", hobbys=" + hobbys + ", schools=" + schools
				+ "]";
	}
	
	
	
}
