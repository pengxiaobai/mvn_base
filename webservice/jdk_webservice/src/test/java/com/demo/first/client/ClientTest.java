package com.demo.first.client;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.junit.Test;

import com.demo.first.service.Student;
import com.demo.first.service.User;
import com.demo.first.service.User.Schools;
import com.demo.first.service.User.Schools.Entry;
import com.demo.first.service.UserService;
import com.demo.first.service.UserService_Service;






/**
 * java自带的不支持对对集合类型的数据的添加
 * 
 * 
 * 
 * 
 * 
 * <b>Description:用户接口测试</b><br>
 * <b>@userName:Peng Xuehui<b><br>
 * 
 * @version 1.0
 * @Note <b>ProjectName:</b> webservice <br>
 * 		<b>PackageName:</b> com.demo.first <br>
 * 		<b>ClassName:</b>UserServiceImplTest.java <br>
 * 		<b>Date:</b> 2017年12月11日 下午3:02:48
 */
public class ClientTest {

	/**
	 * 通过生成的客服端代码调用接口
	 */
	@Test
	public void testFindAll() {
		//创建一个工厂
		UserService_Service factory = new UserService_Service();
		UserService userService =  (UserService) factory.getUserServiceImplPort();
		//调用say方法
		System.out.println(userService.say("武松"));
		
		//==========================添加数据================================
		User user1 = new User();
		user1.setId(222);
		user1.setName("林冲");
		user1.setAge(30);
		//不支持List
//		List<String> hobys1 = new ArrayList<String>();
//		hobys1.add("编写程序");
//		hobys1.add("听故事");
//		Schools schools1 = new Schools();
//		List<Entry> entries1 = schools1.getEntry();
//		Entry entry1 = new Entry();
//		entry1.setKey("小学");
//		entry1.setValue("彭庄小学");
//		entries1.add(entry1);
//		user1.setSchools(schools1);
		userService.addUser(user1);
		System.out.println("添加用户信息完成");
//		schools1
//		schools1.
//		user1.setSchools();
		
		//================================================================
		
		//===========================数据类型验证==========================
		//获取所有用户
		List<User> users = userService.findAll();
		System.out.println("打印用户信息");
		String hobys = "";
	
		for(User user:users){
			if(null != user.getHobbys()){
				for(String temp: user.getHobbys()){
					hobys += temp+",";
				}
			}
			String school = "";
			Schools schools = user.getSchools();
			if(null != schools){
				List<Entry> entries =  schools.getEntry();
				for(Entry entry:entries){
					school += entry.getKey()+":"+entry.getValue();
				}
				
			}
			
			System.out.println("{id:"+user.getId()+",name:"+user.getName()
			+",age:"+user.getAge()+",hobys:"+hobys.substring(0, hobys.length())
			+",Schools:"+school+"}");
		}
		//=============================数据类型验证结束=================================
		
		
		
	
	}
	
	/**
	 * JAX-WS Proxy
	 */
	@Test
	public void testProxy() {
		try {
			//使用的是发布时候的路径
			URL wsdlURl = new URL("http://127.0.0.1:8899/User?wsdl");
			//wsdl文件中开始的 targetNamespace和name
			QName service_name = new QName("http://first.demo.com/", "UserService");
			Service service = Service.create(wsdlURl, service_name);
			UserService service2 = (UserService) service.getPort(UserService.class);
			String result = service2.say("武松");
			System.out.println(result);
			
			
			//打印用户信息
			List<User> users =  service2.findAll();
			for(User user:users){
				System.out.println(user.getName());
			}
			
			
			Student student = new Student();
			student.setId(22);
			student.setName("无言");
			service2.addStudent(student);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	



}
