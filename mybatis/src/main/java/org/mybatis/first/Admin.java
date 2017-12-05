package org.mybatis.first;
/**
 * 
* <b>Description:实体</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> mybatis
* <br><b>PackageName:</b> org.mybatis.first
* <br><b>ClassName:</b>Admin.java
* <br><b>Date:</b> 2017年12月5日 下午4:20:12
 */
public class Admin {
	private int id;
	private String name;
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
	
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
