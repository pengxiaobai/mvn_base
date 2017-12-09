package org.mybatis.first.select.relevance;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> mybatis
* <br><b>PackageName:</b> org.mybatis.first.select.relevance
* <br><b>ClassName:</b> OrderInfoDao
* <br><b>Date:</b> 2017年12月7日 下午10:39:46
*/

public interface OrderInfoDao {

	/**
	 * 使用关联查询 查找订单与客户信息
	* <b>Description:</b><br> 
	* @return
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月7日 下午10:45:36
	* <br><b>Version:</b> 1.0
	 */
	public List<OrderInfoEx> findAllOrderInfo(@Param("order")String order);
	
	
	/**
	 * 
	* <b>Description:关联结果1</b><br> 
	* @param order
	* @return
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月8日 下午10:37:37
	* <br><b>Version:</b> 1.0
	 */
	public List<OrderInfoEx> findAllOrderInfo1(@Param("order")String order);
	
	/**
	 * 
	* <b>Description:集合</b><br> 
	* @param order
	* @return
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月8日 下午10:37:37
	* <br><b>Version:</b> 1.0
	 */
	public List<OrderInfoEx> findAllOrderInfo2(@Param("order")String order);
}
