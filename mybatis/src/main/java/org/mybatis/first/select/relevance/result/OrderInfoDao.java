package org.mybatis.first.select.relevance.result;

import java.util.List;

import org.mybatis.first.select.relevance.OrderInfoEx;

/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> mybatis
* <br><b>PackageName:</b> org.mybatis.first.select.relevance.result
* <br><b>ClassName:</b>OrderInfoDao.java
* <br><b>Date:</b> 2017年12月8日 下午3:37:48
 */
public interface OrderInfoDao {
	
	/**
	* 
	* <b>Description:关联结果查询</b><br> 
	* @param order
	* @return
	* @Exception 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月8日 下午3:44:28
	* <br><b>Version:</b> 1.0
	 */
	public List<OrderInfoEx> findOrderInfoAll(String order);

}
