package com.demo.jdk;

import javax.jws.WebService;

import com.demo.entity.User;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> webservice
* <br><b>PackageName:</b> com.demo.jdk
* <br><b>ClassName:</b> UserImple
* <br><b>Date:</b> 2017年12月10日 上午9:47:44
*/
@WebService
public class UserImple implements UserWS {

	@Override
	public String findUserById(String name) {
		System.out.println("hello world "+name);
		return "hello world  "+name;
	}

}
