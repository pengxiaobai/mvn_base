package org.spring.demo.bean.instantiation.no_staticFactoryMethod;


/**
 * 使用静态的方法创建对象
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.istantiation.staticFactoryMethod.imple
* <br><b>ClassName:</b> UserServiceImpl
* <br><b>Date:</b> 2017年12月21日 下午11:57:54
*/

public class UserServiceImpl{
	private static UserServiceImpl userServiceImpl = new UserServiceImpl();
	
	
	public  UserServiceImpl createInstance(){
		System.out.println("我是非静态方法");
		return userServiceImpl;
	}
	
	public  UserServiceImpl createInstance1(){
		System.out.println("我是非静态方法2");
		return new UserServiceImpl();
	} 


	public void say() {
		System.out.println("你好呀");
	}

}
