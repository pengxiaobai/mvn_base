package org.spring.demo.istantiation.staticFactoryMethod;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.spring.demo.bean.instantiation.staticFactoryMethod.UserService;
import org.spring.demo.bean.instantiation.staticFactoryMethod.imple.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.istantiation.staticFactoryMethod
* <br><b>ClassName:</b> StaticFactoryTest
* <br><b>Date:</b> 2017年12月22日 下午9:52:23
*/

public class StaticFactoryTest {
	private static String resoucePath = "istantiation/staticFactoryMethod/staticFactory.xml";
	private static UserService userService;
	private static UserService userService1;
	
	private static UserService userService2;
	private static UserService userService3;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext applicationContext
			= new ClassPathXmlApplicationContext(resoucePath);
		
		userService = applicationContext.getBean("userServiceImpl", UserServiceImpl.class);
		userService1 =  applicationContext.getBean("userServiceImpl", UserServiceImpl.class);
		userService2 = applicationContext.getBean("userServiceImpl1", UserServiceImpl.class);
		userService3 = applicationContext.getBean("userServiceImpl1", UserServiceImpl.class);
	}

	@Test
	public void test() {
		userService.say();
		System.out.println("验证对象是否相等:"+userService.equals(userService1));
		System.out.println("验证对象是否相等:"+userService2.equals(userService3));
		System.out.println("验证对象是否相等:"+userService.equals(userService3));
	}

}
