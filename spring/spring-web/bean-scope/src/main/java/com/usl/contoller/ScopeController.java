//package com.usl.contoller;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.google.gson.Gson;
//import com.usl.contoller.scope.ApplicationClassBean;
//import com.usl.contoller.scope.RequestClassBean;
//import com.usl.contoller.scope.SessionClassBean;
//
///**
//* <b>Description:
//* 
//*测试bean的范围： request， session， application
//* </b><br> 
//* <b>@userName:Peng Xuehui<b><br>
//* @version 1.0
//* @Note
//* <b>ProjectName:</b> bean-scope
//* <br><b>PackageName:</b> com.usl.contoller
//* <br><b>ClassName:</b> ScopeController
//* <br><b>Date:</b> 2017年12月28日 下午9:10:58
//*/
//
//@Controller
//public class ScopeController {
//	
//	public ScopeController(){
//		System.out.println("我是请求控制层  我被初始化");
//	}
//	@Autowired
//	private RequestClassBean requestClassBean;
//	@Autowired
//	private SessionClassBean sessionClassBean;
//	@Autowired
//	private ApplicationClassBean applicationClassBean;
//	
//	@RequestMapping(value="/scope",method=RequestMethod.GET,produces="text/html;charset=utf-8")
//	@ResponseBody
//	public String scope(){
//		Gson gson = new Gson();
//		Map<String, Object> map = new HashMap<String,Object>();
//		map.put("我是requestClassBean的hashCode", requestClassBean.hashCode());
//		map.put("我是sessionClassBean的hashCode", sessionClassBean.hashCode());
//		map.put("我是applicationClassBean的hashCode", applicationClassBean.hashCode());
//		return gson.toJson(map);
//	}
//	
//	
//	
//}
