package org.spring.demo.bean.compound_property_names;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* <b>Description:测试复合属性</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.compound_property_names
* <br><b>ClassName:</b> CompoundPropertyTest
* <br><b>Date:</b> 2017年12月24日 下午9:26:06
*/

public class CompoundPropertyTest {
	private static String resourcePath = "istantiation/other/compoundProperty.xml";
	private static ApplicationContext applicationContext;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		applicationContext = 
				new ClassPathXmlApplicationContext(resourcePath);
	}

	@Test
	public void test() {
		UserBean userBean = applicationContext.getBean("user",UserBean.class);
		UserBean userBean1 = applicationContext.getBean("user",UserBean.class);
		System.out.println("Ceshi:"+userBean.equals(userBean1));
		System.out.println(userBean.getOrderBean());
	}

}
