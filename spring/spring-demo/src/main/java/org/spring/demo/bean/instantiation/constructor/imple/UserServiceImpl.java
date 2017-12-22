package org.spring.demo.bean.instantiation.constructor.imple;

import java.beans.ConstructorProperties;

import org.spring.demo.bean.instantiation.constructor.UserService;
import org.spring.demo.bean.instantiation.dao.UserDao;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.instantiation.constructor.imple
* <br><b>ClassName:</b> UserServiceImpl
* <br><b>Date:</b> 2017年12月21日 下午10:40:57
*/

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public UserServiceImpl(){
		System.out.println("我是UserServiceImpl无参数构造器");
	}
	
	public UserServiceImpl(int i){
		System.out.println("我是UserServiceImpl一个参数构造器,参数:"+i);
	}
	
	@ConstructorProperties({"ii","name1"})
	public UserServiceImpl(int i,String name){
		System.out.println("我是UserServiceImpl的双参数构造器,i:"+i+",name"+name);
	}
	
	
	public void say() {
		System.out.println("我是用户的服务");
	}

	public void setUserDao(UserDao userDao) {
		System.out.println("我数用户的服务层  我通过set被调用");
		this.userDao = userDao;
	}
	
	
	public UserDao getUserDao() {
		return userDao;
	}

	/**
	 * 
	* <b>Description:调用数据层say</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月21日 下午11:14:29
	* <br><b>Version:</b> 1.0
	 */
	public void pringDaoSay(){
		System.out.println("调用了pringDaoSay");
		if(null != userDao){
			userDao.say();
		}else{
			System.out.println("userDao对象为空");
		}
		
		System.out.println("完成pringDaoSay调用");
	}
	
	
}
