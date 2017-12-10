package com.demo.jdk;

import javax.xml.ws.Endpoint;

/**
* <b>Description:发布接口</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> webservice
* <br><b>PackageName:</b> com.demo.jdk
* <br><b>ClassName:</b> Publish
* <br><b>Date:</b> 2017年12月10日 上午9:53:31
*/

public class Publish {

	public static void main(String[] args) {
		String url = "http://192.168.0.102:8881/User";
		Endpoint.publish(url, new UserImple());
		String url1 = "http://192.168.0.102:8881/Student";
		Endpoint.publish(url1, new StudentWSImple());
	}

}
