package org.mybatis.first;

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
	
	/**
	 * 
	* <b>Description:插入一条数据</b><br> 
	* @param admin
	* @return
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月7日 上午12:10:49
	* <br><b>Version:</b> 1.0
	 */
	public int insertAdmin(Admin admin);
	
	/**
	 * 
	* <b>Description:插入多条数据</b><br> 
	* @param admins
	* @return
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月7日 上午12:11:33
	* <br><b>Version:</b> 1.0
	* 
	* 注意：名称必须为list
	 */
	public int insertAdmins(@Param("list")List<Admin> admins);
	
	/**
	 * 
	* 
	* <b>Description:修改账号信息</b><br> 
	* @param admin
	* @return
	* @Exception 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月7日 上午10:53:14
	* <br><b>Version:</b> 1.0
	 */
	public int updateAdmin(@Param("name")String name,@Param("name1")String name1);
	
	/**
	 * 
	* 
	* <b>Description:删除信息</b><br> 
	* @param id
	* @return
	* @Exception 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月7日 上午10:57:10
	* <br><b>Version:</b> 1.0
	 */
	public int deleteAdminByid(int id);
	
	
	
	
}
