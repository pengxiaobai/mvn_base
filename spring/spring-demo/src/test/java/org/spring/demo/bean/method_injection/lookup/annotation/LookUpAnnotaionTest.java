package org.spring.demo.bean.method_injection.lookup.annotation;


import org.junit.BeforeClass;
import org.junit.Test;
import org.spring.demo.bean.method_injection.Command;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.method_injection.lookup.annotation
* <br><b>ClassName:</b> LookUpAnnotaionTest
* <br><b>Date:</b> 2017年12月26日 下午9:22:51
*/

public class LookUpAnnotaionTest {
	private static String resourcePath = "istantiation/other/method_injection2.xml";
	private static ApplicationContext applicationContext;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		applicationContext
		= new ClassPathXmlApplicationContext(resourcePath);
	}

	@Test
	public void test() {
		LookUpAnnotaion lookUpAnnotaion = 
				applicationContext.getBean("lookupAnnotation",LookUpAnnotaion.class);
		Command command = lookUpAnnotaion.retrunCommand();
		Command commadn1 = lookUpAnnotaion.retrunCommand();
		
		System.out.println(command.equals(commadn1));
	}

}
