package org.spring.demo.bean.method_injection;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.spring.demo.bean.method_injection.lookup.CommandMannager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.method_injection
* <br><b>ClassName:</b> CommandManagerTest
* <br><b>Date:</b> 2017年12月24日 下午11:51:10
*/

public class CommandManagerTest {
	private static String resourcePath = "istantiation/other/method_injection.xml";
	private static ApplicationContext applicationContext;
			
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		applicationContext = 
				new ClassPathXmlApplicationContext(resourcePath);
	}

	/**
	 * 方法注入测试1
	* <b>Description:</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月25日 下午10:55:36
	* <br><b>Version:</b> 1.0
	 */
	@Test
	public void test() {
		CommandManager commandManager =
				applicationContext.getBean("commandManager",CommandManager.class);
		commandManager.setApplicationContext(applicationContext);
		Command command1 = commandManager.createCommand();
		Command command2 = commandManager.createCommand();
		System.out.println(command1.equals(command2));
	}
	
	/**
	 * 
	* <b>Description:测试lookup方法注入</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月25日 下午11:37:02
	* <br><b>Version:</b> 1.0
	 */
	@Test
	public void lookUpTest(){
		CommandMannager commandMannager = applicationContext.getBean("lookup",CommandMannager.class);
		Command command1 = commandMannager.createCommand();
		Command command2 = commandMannager.createCommand();
		System.out.println(command1.equals(command2));
	}
	
	
	
	
	
	
	
	
	/**
	 * 不使用方法注入  单例与多例测试结果
	* <b>Description:</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月25日 下午11:35:52
	* <br><b>Version:</b> 1.0
	 */
	@Test
	public void test1(){
		CommandMannage2 commandMannage21 =
				applicationContext.getBean("commandManager2",CommandMannage2.class);
		
		CommandMannage2 commandMannage22 =
				applicationContext.getBean("commandManager2",CommandMannage2.class);
		
		System.out.println(commandMannage21.equals(commandMannage22));
	}
	

}
