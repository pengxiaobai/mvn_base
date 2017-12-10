package com.demo.jdk;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> webservice
* <br><b>PackageName:</b> com.demo.jdk
* <br><b>ClassName:</b> StudentWS
* <br><b>Date:</b> 2017年12月10日 下午8:46:40
*/
@WebService
public interface StudentWS {
	
	@WebMethod
	public String findStudents(int id);

}
