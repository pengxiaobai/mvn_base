package org.mybatis.first.select.relevance;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.first.SqlSessionFactoryDemo;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> mybatis
* <br><b>PackageName:</b> org.mybatis.first.select.relevance
* <br><b>ClassName:</b> OrderInfoDaoTest
* <br><b>Date:</b> 2017年12月7日 下午10:56:03
*/

public class OrderInfoDaoTest {
	private SqlSessionFactory factory;
	
	@Before
	public void setUp() throws Exception {
		factory = SqlSessionFactoryDemo.createSqlSessionFactory("mybatis-config.xml");
	}

	@Test
	public void test() {
		SqlSession session = factory.openSession();
		
		OrderInfoDao orderInfoDao = session.getMapper(OrderInfoDao.class);
		List<OrderInfoEx> orderInfoExs = 	orderInfoDao.findAllOrderInfo("createTime desc");
		for(OrderInfoEx orderInfoEx :orderInfoExs){
			System.out.println("订单信息:"+orderInfoEx);
			System.out.println("用户信息:"+orderInfoEx.getUser());
		}
		session.close();
	}

}
