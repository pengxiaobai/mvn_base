package org.mybatis.first.select;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> mybatis
* <br><b>PackageName:</b> org.mybatis.first
* <br><b>ClassName:</b>UserDao.java
* <br><b>Date:</b> 2017年12月7日 下午2:37:10
 */
public interface UserDao {
	
	/**
	* 
	* <b>Description:按照指定的列排序</b><br> 
	* @param order
	* @return
	* @Exception 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月7日 下午2:46:24
	* <br><b>Version:</b> 1.0
	 */
	public List<User> findAllUsers(@Param("order")String order);

}
