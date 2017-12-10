package com.demo.jdk;

import javax.jws.WebService;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> webservice
* <br><b>PackageName:</b> com.demo.jdk
* <br><b>ClassName:</b> StudentWSImple
* <br><b>Date:</b> 2017年12月10日 下午8:48:11
*/
@WebService
public class StudentWSImple implements StudentWS {

	@Override
	public String findStudents(int id) {
		return "学生信息是:"+id;
	}

}
