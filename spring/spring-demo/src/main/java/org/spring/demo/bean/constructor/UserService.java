package org.spring.demo.bean.constructor;
/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.constructor
* <br><b>ClassName:</b> UserService
* <br><b>Date:</b> 2017年12月18日 下午11:42:01
*/

public class UserService {
	private OrderService orderService;
	
	
	public UserService(OrderService orderService){
		this.orderService = orderService;
	}
	
	public void findUser(){
		System.out.println("我是用户小白兔");
		orderService.say();
	}
}
