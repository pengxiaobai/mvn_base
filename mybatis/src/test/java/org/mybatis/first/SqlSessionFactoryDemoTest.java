package org.mybatis.first;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> mybatis
* <br><b>PackageName:</b> org.mybatis.first
* <br><b>ClassName:</b>SqlSessionFactoryDemoTest.java
* <br><b>Date:</b> 2017年12月5日 下午4:39:47
 */
public class SqlSessionFactoryDemoTest {

	@Test
	public void test() {
		try {
			//创建sqlsessionfactory
			SqlSessionFactory factory = SqlSessionFactoryDemo
					.createSqlSessionFactory("mybatis-config.xml");
			
			//创建sqlsession
			SqlSession session = factory.openSession();
			AdminDao adminDao = (AdminDao)session.getMapper(AdminDao.class);
			List<Admin> admins = adminDao.find(1);
			if(null != admins && 0 < admins.size()){
				System.out.println(admins.get(0));
			}
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test1() {
		try {
			//创建sqlsessionfactory
			SqlSessionFactory factory = SqlSessionFactoryDemo
					.createSqlSessionFactory("mybatis-config.xml");
			
			//创建sqlsession
			SqlSession session = factory.openSession();
			AdminDao adminDao = (AdminDao)session.getMapper(AdminDao.class);
			List<Admin> admins = adminDao.find(1);
			if(null != admins && 0 < admins.size()){
				System.out.println(admins.get(0));
			}
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
