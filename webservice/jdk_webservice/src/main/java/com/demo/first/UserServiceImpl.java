package com.demo.first;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.demo.entity.Student;
import com.demo.entity.User;

/**
 * 
* <b>Description:用户接口实现类</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> webservice
* <br><b>PackageName:</b> com.demo.first
* <br><b>ClassName:</b>UserServiceImpl.java
* <br><b>Date:</b> 2017年12月11日 下午2:38:23
 */

@WebService(endpointInterface="com.demo.first.UserService",
serviceName="UserService")
public class UserServiceImpl implements UserService {
	private static List<User> users = new ArrayList<User>(); //用户信息
	
	/**
	 * 
	 *构造器
	 * @Time:2017年12月11日 下午2:40:36
	 * @Username:Peng xh
	 * @Todo:TODO
	 * @param users
	 */
	public UserServiceImpl(List<User> users) {
		this.users = users;
	}
	
	
	/**
	 * 打印你好+name
	 */
	@Override
	public String say(String name) {
		return "hello "+name;
	}
	
	
	/**
	 * 获取用户信息
	 */
	@Override
	public List<User> findAll() {
		return users;
	}

	/**
	 *根据用户id,查找用户信息
	 */
	@Override
	public User findUserById(int id) {
		return null;
	}

	/**
	 * 添加用信息
	 */
	@Override
	public boolean addUser(User user) {
		users.add(user);
		System.out.println("添加用户信息:"+user);
		return true;
	}


	@Override
	public boolean addStudent(Student stu) {
		System.out.println("添加数据:"+stu);
		return false;
	}

}
