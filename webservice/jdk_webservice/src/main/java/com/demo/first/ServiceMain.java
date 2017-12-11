package com.demo.first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.Endpoint;

import com.demo.entity.User;

/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> webservice
* <br><b>PackageName:</b> com.demo.first
* <br><b>ClassName:</b>UserDemo.java
* <br><b>Date:</b> 2017年12月11日 下午2:14:49
 */
public class ServiceMain {
	
	public static void main(String[] args) {
		String url = "http://127.0.0.1:8899/User";
		List<User> users = new ArrayList<User>();
		List<String> hobbys = new ArrayList<String>();
		hobbys.add("打篮球");
		hobbys.add("游泳");
		hobbys.add("听音乐");
		Map<String,String> maps = new HashMap<String, String>();
		maps.put("小学","新华学校");
		maps.put("初中", "第一初中");
		maps.put("高中", "第一高中");
		maps.put("大学", "清华大学");
		User user = new User(1,"王军",29,hobbys,maps);
		users.add(user);
		UserService userService = new UserServiceImpl(users);
		Endpoint.publish(url, userService);
		
		System.out.println("发布成功");
	}

}
