package org.spring.demo.bean.configuration;

import org.springframework.beans.factory.annotation.Required;

/**
 * 
 * 测试bena的配置
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.configuration
* <br><b>ClassName:</b> MyConfig
* <br><b>Date:</b> 2017年12月23日 下午3:09:38
*/

public class MyConfig {
	private Integer id;
	private String name;
	
	/*
	 * @Required 代表属性必须配置
	 * 必须 在配置文件中 配置  <context:annotation-config/>
	 * 
	 * */
	@Required
	public void setId(Integer id) {
		System.out.println("我被执行了(id)");
		this.id = id;
	}

	@Required
	public void setName(String name) {
		System.out.println("我被执行了(name)");
		this.name = name;
	}
	
	
	public void say(){
		System.out.println("id:"+id+",name:"+name);
	}
	
}
