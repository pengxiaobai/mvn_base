package org.mybatis.first.select;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.first.SqlSessionFactoryDemo;
import org.mybatis.first.select.User;
import org.mybatis.first.select.UserDao;

/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> mybatis
* <br><b>PackageName:</b> org.mybatis.first
* <br><b>ClassName:</b>UserTest.java
* <br><b>Date:</b> 2017年12月7日 下午2:49:54
 */
public class UserTest {

	private SqlSessionFactory factory = null;
	/**
	* 
	* <b>Description:</b><br> 
	* @throws java.lang.Exception
	* @Exception 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月7日 下午2:49:54
	* <br><b>Version:</b> 1.0
		*/
	@Before
	public void setUp() throws Exception {
		factory = SqlSessionFactoryDemo.createSqlSessionFactory("mybatis-config.xml");
	}

	/**
	 * 按照指定列排序
	* 
	* <b>Description:</b><br> 
	* @Exception 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月7日 下午2:52:05
	* <br><b>Version:</b> 1.0
	 */
	@Test
	public void testFindAllUsers() {
		SqlSession session = factory.openSession();
		UserDao userDao = session.getMapper(UserDao.class);
		List<User> users =  userDao.findAllUsers("createTime desc");
		for(User user :users){
			System.out.println(user);
		}
		System.out.println("按照指定列名查找数据完成");
		session.close();
	}
	
	
	

}
