package org.spring.demo;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.spring.demo.bean.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo
* <br><b>ClassName:</b> UserServiceTest
* <br><b>Date:</b> 2017年12月18日 下午10:12:11
*/

public class UserServiceTest {
	private static UserService userService;
	private static String xmPath = "applicationContext.xml";
	
	@BeforeClass
	public static void tearDownAfterClass() throws Exception {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext(xmPath); 
		//ClassPathXmlApplicationContext可以多参数
		userService = applicationContext.getBean("userServiceName",UserService.class);
	}

	@Test
	public void testSay() {
		System.out.println("开始执行");
		userService.say("世界");
		System.out.println("执行完成");
	}

}
