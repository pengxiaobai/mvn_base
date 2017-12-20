package org.spring.demo.constructor;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.spring.demo.bean.constructor.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.constructor
* <br><b>ClassName:</b> ConstructorTest
* <br><b>Date:</b> 2017年12月19日 上午12:06:29
*/

public class ConstructorTest {
	private static String xmlPath = "constructor/constructors.xml";
	private static ApplicationContext appclicationContext = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		appclicationContext = new ClassPathXmlApplicationContext(xmlPath);
	}

	@Test
	public void test() {
		UserService userService = appclicationContext.getBean("userService",UserService.class);
		userService.findUser();
	}

}
