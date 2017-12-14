package com.demo.controller;
/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring_boot_first
* <br><b>PackageName:</b> com.demo.controller
* <br><b>ClassName:</b> Greeting
* <br><b>Date:</b> 2017年12月14日 下午11:35:11
*/

public class Greeting {
	private final long id;
	private final String content;
	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}

}
