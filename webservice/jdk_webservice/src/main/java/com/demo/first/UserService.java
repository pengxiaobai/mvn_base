package com.demo.first;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.demo.entity.Student;
import com.demo.entity.User;

/**
 * 
* <b>Description:用户接口</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> webservice
* <br><b>PackageName:</b> com.demo.first
* <br><b>ClassName:</b>UserService.java
* <br><b>Date:</b> 2017年12月11日 下午2:24:04
 */
@WebService
public interface UserService {
	
	/**
	 * 
	* 打印名称
	* <b>Description:</b><br> 
	* @param name
	* @return
	* @Exception 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月11日 下午2:36:09
	* <br><b>Version:</b> 1.0
	 */
	@WebMethod
	public String say(String name);
	
	/**
	 * 获取所有用户信息
	* 
	* <b>Description:</b><br> 
	* @return
	* @Exception 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月11日 下午2:36:22
	* <br><b>Version:</b> 1.0
	 */
	@WebMethod
	public List<User> findAll();
	
	/**
	 * 根据id获取用户信息
	* 
	* <b>Description:</b><br> 
	* @param id
	* @return
	* @Exception 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月11日 下午2:36:34
	* <br><b>Version:</b> 1.0
	 */
	@WebMethod
	public User findUserById(int id);
	
	/**
	 * 
	* 添加用户信息
	* <b>Description:</b><br> 
	* @param user
	* @return
	* @Exception 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月11日 下午2:37:26
	* <br><b>Version:</b> 1.0
	 */
	@WebMethod
	public boolean addUser(User user);
	
	/**
	 * 添加学生数据
	* <b>Description:</b><br> 
	* @param stu
	* @return
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月11日 下午10:04:18
	* <br><b>Version:</b> 1.0
	 */
	public boolean addStudent(Student stu);
	
	

}
