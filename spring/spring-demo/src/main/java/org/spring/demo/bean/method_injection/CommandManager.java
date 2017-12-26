package org.spring.demo.bean.method_injection;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
* <b>Description:
* 注入方法测试
* 这种方法一般 不可取   因为业务代码与spring耦合在一起了
* 
* 
* </b><br> 
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
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	/**
	 * 
	* <b>Description:获取新的实例对象</b><br> 
	* @return
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月25日 下午11:08:31
	* <br><b>Version:</b> 1.0
	 */
	public Command createCommand(){
		System.out.println("我是CommandManager,我创建了Command");
		return this.applicationContext.getBean("command",Command.class);
	}
	
	
}
