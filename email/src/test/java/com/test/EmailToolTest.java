package com.test;

import static org.junit.Assert.*;

import org.exception.MyException;
import org.junit.Test;

import com.demo.EmailTool;

/**
 * 
* <b>Description:邮件测试</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> email
* <br><b>PackageName:</b> com.test
* <br><b>ClassName:</b>EmailToolTest.java
* <br><b>Date:</b> 2017年12月4日 下午3:41:59
 */
public class EmailToolTest {

	/**
	* <b>Description: 测试邮件发送</b><br> 
	* @Exception 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月4日 下午3:42:32
	* <br><b>Version:</b> 1.0
	 */
	@Test
	public void testSend() {
		boolean flag = false;
		try {
			EmailTool emailTool = new EmailTool("1033180006@qq.com","ezzwkyitdjzabgba",
					"smtp.qq.com", 465);
			try {
				flag = emailTool.send("2929448430@qq.com", "测试邮件","我只是测试一下");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	  }

}
