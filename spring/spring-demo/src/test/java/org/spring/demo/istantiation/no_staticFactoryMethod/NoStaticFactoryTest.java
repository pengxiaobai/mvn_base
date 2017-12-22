package org.spring.demo.istantiation.no_staticFactoryMethod;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.spring.demo.bean.instantiation.no_staticFactoryMethod.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.istantiation.no_staticFactoryMethod
* <br><b>ClassName:</b> NoStaticFactoryTest
* <br><b>Date:</b> 2017年12月22日 下午10:33:06
*/

public class NoStaticFactoryTest {
	private static String resuocePath = "istantiation/no_staticFactoryMethod/no_staticFactory.xml";
	private static UserServiceImpl  userServiceImpl;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext applicationContext
		= new ClassPathXmlApplicationContext(resuocePath);
		userServiceImpl = applicationContext.getBean("no_static", UserServiceImpl.class);
	}

	@Test
	public void test() {
		userServiceImpl.say();
	}

}
