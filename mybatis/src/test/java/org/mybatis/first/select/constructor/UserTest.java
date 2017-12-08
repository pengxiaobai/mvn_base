package org.mybatis.first.select.constructor;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.mybatis.first.SqlSessionFactoryDemo;

/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> mybatis
* <br><b>PackageName:</b> org.mybatis.first.select.constructor
* <br><b>ClassName:</b>UserTest.java
* <br><b>Date:</b> 2017年12月7日 下午3:46:34
 */
public class UserTest {


	@Test
	public void findAllUsers() {
		try {
			SqlSessionFactory factory = SqlSessionFactoryDemo
					.createSqlSessionFactory("mybatis-config.xml");
			SqlSession session = factory.openSession();
			UserDao userDao = session.getMapper(UserDao.class);
			
			List<User> users =  userDao.findAllUsers("createTime desc");
			for(User user:users){
				System.out.println(user);
			}
			System.out.println("构造器查询");
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void findAllUsers1() {
		try {
			SqlSessionFactory factory = SqlSessionFactoryDemo
					.createSqlSessionFactory("mybatis-config.xml");
			SqlSession session = factory.openSession();
			UserDao userDao = session.getMapper(UserDao.class);
			
			List<User> users =  userDao.findAllUsers1("createTime desc");
			for(User user:users){
				System.out.println(user);
			}
			System.out.println("构造器查询1");
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
