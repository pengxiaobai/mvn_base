package com.demo.client;

import org.junit.Test;

import junit.framework.TestCase;

/**
* <b>Description:测试jdk产生的webservice </b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> webservice
* <br><b>PackageName:</b> com.demo.client
* <br><b>ClassName:</b> UserImpleTest
* <br><b>Date:</b> 2017年12月10日 下午9:03:24
*/

public class UserImpleTest extends TestCase {
	@Test
	public void test(){
		//通过动态代理获取操作接口对象
		UserImpleService factory = new UserImpleService();
		UserImple userImple = factory.getUserImplePort();
		String result = userImple.findUserById("张三");
		System.out.println(result);
	}

}
