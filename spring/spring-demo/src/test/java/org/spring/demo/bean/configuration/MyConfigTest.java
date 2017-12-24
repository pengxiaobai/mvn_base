package org.spring.demo.bean.configuration;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.configuration
* <br><b>ClassName:</b> MyConfigTest
* <br><b>Date:</b> 2017年12月23日 下午3:14:52
*/

public class MyConfigTest {
	private static String resoucePath = "configuration/myConfig.xml";
	private static ApplicationContext applicationContext;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext(resoucePath);
	}

	/**
	 * 
	* <b>Description:测试set注入</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月23日 下午3:18:14
	* <br><b>Version:</b> 1.0
	 */
	@Test
	public void test() {
		MyConfig myConfig = applicationContext.getBean("myConfig1",MyConfig.class);
		myConfig.say();
	}
	
	/**
	 * 
	* <b>Description:测试  p-namespace配置</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月23日 下午7:42:38
	* <br><b>Version:</b> 1.0
	 */
	@Test
	public void test1(){
		MyConfig config = applicationContext.getBean("myConfig2",MyConfig.class);
		config.say();
		
	}
	
	/**
	 * 
	* <b>Description:PropertyPlaceholderConfigurer 测试</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月23日 下午8:27:41
	* <br><b>Version:</b> 1.0
	 */
	@Test
	public void test2(){
		MyConfig config = applicationContext.getBean("myConfig3",MyConfig.class);
		config.say();
	}

	
	@Test
	public void test3(){
		MyConfig config = applicationContext.getBean("myConfig4",MyConfig.class);
		config.say();
	}
}
