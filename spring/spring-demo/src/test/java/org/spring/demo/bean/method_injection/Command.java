package org.spring.demo.bean.method_injection;
/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.method_injection
* <br><b>ClassName:</b> Command
* <br><b>Date:</b> 2017年12月24日 下午11:41:45
*/

public class Command {
	private int id;
	private String name;
	
	
	
	public int getId() {
		System.out.println("我被实例化（id）");
		return id;
	}
	public void setId(int id) {
		System.out.println("我被实例化（name）");
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
		return "Command [id=" + id + ", name=" + name + "]";
	}
	
	
}
