package org.mybatis.first;


import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.mb.mp.User;
import com.mb.mp.UserDao;

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
	
	/**
	 * 
	* <b>Description:插入一条数据</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月7日 上午12:01:54
	* <br><b>Version:</b> 1.0
	 */
	@Test
	public void test3(){
		SqlSessionFactory factory;
		try {
			factory = SqlSessionFactoryDemo
					.createSqlSessionFactory("mybatis-config.xml");
			//创建sqlsession
			SqlSession session = factory.openSession();
			AdminDao adminDao = (AdminDao)session.getMapper(AdminDao.class);;
			Admin admin = new Admin();
			admin.setName("zzz");
			adminDao.insertAdmin(admin);
			session.commit();
			System.out.println("主键:"+admin.getId());
			session.close();
			System.out.println("插入完成");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	/**
	 * 
	* <b>Description:插入多条数据</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月7日 上午12:02:52
	* <br><b>Version:</b> 1.0
	 */
	@Test
	public void test4(){
		SqlSessionFactory factory = null;
		try{
			factory = SqlSessionFactoryDemo
					.createSqlSessionFactory("mybatis-config.xml");
			SqlSession session = factory.openSession();
			List<Admin> admins = new ArrayList<Admin>();
			Admin admin = new Admin();
			admin.setName("kkk");
			admins.add(admin);
			admin = new Admin();
			admin.setName("hhhh");
			admins.add(admin);
			AdminDao adminDao = session.getMapper(AdminDao.class);
			adminDao.insertAdmins(admins);
			session.commit();
			for(Admin admin2:admins){
				System.out.println("主键:"+admin2.getId()+",姓名:"+admin2.getName());
			}
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
