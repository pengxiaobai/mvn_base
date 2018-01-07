package org.spring.demo.bean.callbacks;

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
* <br><b>PackageName:</b> org.spring.demo.bean.callbacks
* <br><b>ClassName:</b> ExampleBeanTest
* <br><b>Date:</b> 2018年1月1日 下午10:54:55
*/

public class ExampleBeanTest {
	private static String resoucePath = "istantiation/callbacks/callbacks.xml";
	private static ApplicationContext application;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		application = new ClassPathXmlApplicationContext(resoucePath);
	}

	@Test
	public void test() {
		ExampleBean exampleBean = application.getBean("exampleBean", ExampleBean.class);
		exampleBean.say();
	}
	
	
	//销毁回调测试
	@Test
	public void test1() {
		ExampleBean exampleBean = application.getBean("exampleBean1", ExampleBean.class);
		exampleBean.say1();
		((ClassPathXmlApplicationContext)application).close();
	}

}
