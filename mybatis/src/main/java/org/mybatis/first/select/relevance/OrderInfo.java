package org.mybatis.first.select.relevance;
/**
* <b>Description:订单实体类</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> mybatis
* <br><b>PackageName:</b> org.mybatis.first.select.relevance
* <br><b>ClassName:</b> OrderInfo
* <br><b>Date:</b> 2017年12月7日 下午10:40:02
*/

import java.sql.Timestamp;

public class OrderInfo {
	private long id;
	private int userId;
	private String shoppName;
	private String commodity;
	private double price;
	private Timestamp createTime;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	public double getPrice() {
		return price;
	}
	public void setPricce(double price) {
		this.price = price;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public String getShoppName() {
		return shoppName;
	}
	public void setShoppName(String shoppName) {
		this.shoppName = shoppName;
	}
	@Override
	public String toString() {
		return "OrderInfo [id=" + id + ", userId=" + userId + ", shoppName=" + shoppName + ", commodity=" + commodity
				+ ", price=" + price + ", createTime=" + createTime + "]";
	}
	
	
	
}
