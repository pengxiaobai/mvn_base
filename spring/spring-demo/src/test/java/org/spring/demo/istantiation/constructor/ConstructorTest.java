package org.spring.demo.istantiation.constructor;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.spring.demo.bean.instantiation.constructor.UserService;
import org.spring.demo.bean.instantiation.constructor.imple.UserServiceImpl;
import org.spring.demo.bean.instantiation.constructor.imple.UserServiceImpl1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * 在加载配置文件的时候  会加载配置文件的所以有bean，一个类如果配置了多个bean,那么就会被实例化多次
 * 默认创建的对象是单例的
 * 默认采用的是无参数构造器
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.istantiation.constructor
* <br><b>ClassName:</b> ConstructorTest
* <br><b>Date:</b> 2017年12月21日 下午10:44:38
*/

public class ConstructorTest {
	private static String resoucePath = "istantiation/constructor/constructors.xml";
	private static ApplicationContext applicationContext;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 applicationContext = 
				new ClassPathXmlApplicationContext(resoucePath);
		
	}

	@Test
	public void test() {
		UserService service = applicationContext.getBean("userService0", UserServiceImpl.class);
		UserService service1 = applicationContext.getBean("userService1", UserServiceImpl.class);
		UserService service2 = applicationContext.getBean("userService1", UserServiceImpl.class);
		UserService service3 = applicationContext.getBean("userService2", UserServiceImpl.class);
		UserServiceImpl userServiceImpl = applicationContext.getBean("userService2", UserServiceImpl.class);
		UserServiceImpl1 service11 = applicationContext.getBean("userService11", UserServiceImpl1.class);
		
		//验证对象service与service2是否相等 false
		System.out.println(service.equals(service1));
		//验证对象service1与service2是否相等    true
		System.out.println(service2.equals(service1));
		
		service3.pringDaoSay();
		
		//验证UserServiceImpl中的userDao与UserServiceImpl1中的userDao是否相等  true
		System.out.println("userDao是否相等:"+userServiceImpl.getUserDao().equals(service11.getUserDao()));
		//再次验证对象是否为单例
		userServiceImpl.getUserDao().setName("李四");
		System.out.println(service11.getUserDao().getName());
		System.out.println("hashcode:"+service11.hashCode());
		userServiceImpl =null;
		System.out.println(service11.getUserDao().getName());
		
	}

}
