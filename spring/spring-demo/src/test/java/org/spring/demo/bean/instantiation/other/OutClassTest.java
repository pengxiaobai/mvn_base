package org.spring.demo.bean.instantiation.other;

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
* <br><b>PackageName:</b> org.spring.demo.bean.instantiation.other
* <br><b>ClassName:</b> OutClassTest
* <br><b>Date:</b> 2017年12月23日 下午9:42:24
*/

public class OutClassTest {
	private static String resourcePath = "istantiation/other/other.xml";
	private static ApplicationContext applicationContext;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext(resourcePath);
	}

	@Test
	public void test() {
		OutClass outClass = applicationContext.getBean("outClass", OutClass.class);
		outClass.say();
	}
	
	@Test
	public void test1() {
		OutClass outClass = applicationContext.getBean("outClass1", OutClass.class);
		outClass.say1();
	}

}
