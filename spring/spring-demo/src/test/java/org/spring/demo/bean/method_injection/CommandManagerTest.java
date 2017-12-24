package org.spring.demo.bean.method_injection;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
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

	@Test
	public void test() {
		CommandManager commandManager = new CommandManager();
		commandManager.setApplicationContext(applicationContext);
		Command command1 = commandManager.createCommand();
		Command command2 = commandManager.createCommand();
		System.out.println(command1.equals(command2));
	}

}
