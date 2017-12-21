package org.spring.demo.bean.instantiation.constructor.imple;

import org.spring.demo.bean.instantiation.constructor.UserService;
import org.spring.demo.bean.instantiation.dao.UserDao;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.instantiation.constructor.imple
* <br><b>ClassName:</b> UserServiceImpl1
* <br><b>Date:</b> 2017年12月21日 下午11:30:41
*/

public class UserServiceImpl1 implements UserService{
	private UserDao userDao;

	public UserServiceImpl1(UserDao userDao){
		this.userDao = userDao;
	}
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pringDaoSay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userDao == null) ? 0 : userDao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserServiceImpl1 other = (UserServiceImpl1) obj;
		if (userDao == null) {
			if (other.userDao != null)
				return false;
		} else if (!userDao.equals(other.userDao))
			return false;
		return true;
	}
	
	
	

}
