package org.mybatis.first;

import java.util.List;

/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> mybatis
* <br><b>PackageName:</b> org.mybatis.first
* <br><b>ClassName:</b>AdminDao.java
* <br><b>Date:</b> 2017年12月5日 下午4:22:37
 */
public interface AdminDao {
	/**
	* 
	* <b>Description:查找账号信息</b><br> 
	* @param id
	* @return
	* @Exception 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月5日 下午4:32:55
	* <br><b>Version:</b> 1.0
	 */
	public List<Admin> find(int id);
}
