package org.spring.demo.bean.compound_property_names;
/**
* <b>Description:测试复合属性</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.compound_property_names
* <br><b>ClassName:</b> UserBean
* <br><b>Date:</b> 2017年12月24日 下午9:20:35
*/


public class UserBean {
	private OrderBean orderBean;

	public OrderBean getOrderBean() {
		return orderBean;
	}

	public void setOrderBean(OrderBean orderBean) {
		this.orderBean = orderBean;
	}
}
