package org.mybatis.first.select.relevance;
/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> mybatis
* <br><b>PackageName:</b> org.mybatis.first.select.relevance
* <br><b>ClassName:</b> OrderInfoEx
* <br><b>Date:</b> 2017年12月7日 下午10:42:56
*/

import org.mybatis.first.select.User;

public class OrderInfoEx  extends OrderInfo{
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
