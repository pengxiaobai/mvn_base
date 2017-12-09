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

	/**
	 * 关联查询
	* <b>Description:</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月8日 下午10:46:44
	* <br><b>Version:</b> 1.0
	 */
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
	
	/**
	 * 关联结果
	* <b>Description:</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月9日 下午11:01:18
	* <br><b>Version:</b> 1.0
	 */
	@Test
	public void testFindAllOrderInfo1(){
		SqlSession session = factory.openSession();
		OrderInfoDao orderInfoDao = session.getMapper(OrderInfoDao.class);
		List<OrderInfoEx> orderInfoExs = 	orderInfoDao.findAllOrderInfo1("createTime desc");
		for(OrderInfoEx orderInfoEx :orderInfoExs){
			System.out.println("订单信息:"+orderInfoEx);
			System.out.println("用户信息:"+orderInfoEx.getUser());
		}
		session.close();
		
	}
	
	/**
	 * 集合
	* <b>Description:</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月9日 下午11:01:30
	* <br><b>Version:</b> 1.0
	 */
	@Test
	public void testFindAllOrderInfo2(){
		SqlSession session = factory.openSession();
		
		OrderInfoDao orderInfoDao = session.getMapper(OrderInfoDao.class);
		List<OrderInfoEx> orderInfoExs = 	orderInfoDao.findAllOrderInfo2("createTime desc");
		for(OrderInfoEx orderInfoEx :orderInfoExs){
			System.out.println("订单信息:"+orderInfoEx);
			System.out.println("商品信息:"+orderInfoEx.getOrderGoodss());
		}
		session.close();
		
	}

}
