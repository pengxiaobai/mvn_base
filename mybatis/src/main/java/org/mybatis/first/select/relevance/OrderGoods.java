package org.mybatis.first.select.relevance;
/**
* <b>Description:订单商品详情表</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> mybatis
* <br><b>PackageName:</b> org.mybatis.first.select.relevance
* <br><b>ClassName:</b> OrderGoods
* <br><b>Date:</b> 2017年12月8日 下午11:45:06
*/

import java.sql.Timestamp;

public class OrderGoods {
	private long id;
	private long orderInfoId;
	private String name;
	private Timestamp createTime;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getOrderInfoId() {
		return orderInfoId;
	}
	public void setOrderInfoId(long orderInfoId) {
		this.orderInfoId = orderInfoId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "OrderGoods [id=" + id + ", orderInfoId=" + orderInfoId + ", name=" + name + ", createTime=" + createTime
				+ "]";
	}
	
	

}
