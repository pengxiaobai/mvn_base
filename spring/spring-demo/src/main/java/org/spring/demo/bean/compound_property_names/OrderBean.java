package org.spring.demo.bean.compound_property_names;
/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.compound_property_names
* <br><b>ClassName:</b> OrderBean
* <br><b>Date:</b> 2017年12月24日 下午9:20:44
*/

public class OrderBean {
	private int id;
	private String orderId;
	public void setId(int id) {
		this.id = id;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		return "OrderBean [id=" + id + ", orderId=" + orderId + "]";
	}
	
}
