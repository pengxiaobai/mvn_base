package com.mb.mp;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> mybatis
* <br><b>PackageName:</b> org.mybatis.mapper
* <br><b>ClassName:</b>UserDaoMapper.java
* <br><b>Date:</b> 2017年12月6日 下午3:04:13
 */
public interface UserDao {

	/**
	 * 
	* 
	* <b>Description:插入用户数据</b><br> 
	* @param users 用户集合类
	* @return
	* @Exception 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月6日 下午3:08:15
	* <br><b>Version:</b> 1.0
	 */
	public List<Integer> insertUser(@Param("users") List<User> users);
	
	
}
