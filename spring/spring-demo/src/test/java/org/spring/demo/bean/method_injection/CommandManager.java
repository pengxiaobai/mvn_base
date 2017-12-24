package org.spring.demo.bean.method_injection;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.method_injection
* <br><b>ClassName:</b> CommandManager
* <br><b>Date:</b> 2017年12月24日 下午11:42:44
*/

public class CommandManager implements ApplicationContextAware {
	private ApplicationContext applicationContext;
	
	
	public Command createCommand(){
		System.out.println("我是CommandManager,我创建了Command");
		return applicationContext.getBean("command",Command.class);
	}
	
	
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

}
