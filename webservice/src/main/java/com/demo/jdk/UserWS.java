package com.demo.jdk;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceProvider;

import com.demo.entity.User;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> webservice
* <br><b>PackageName:</b> com.demo.jdk
* <br><b>ClassName:</b> User
* <br><b>Date:</b> 2017年12月10日 上午9:45:08
*/

@WebService
public interface UserWS {
	@WebMethod
	public String findUserById(String name);
}
