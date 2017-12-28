package com.usl.contoller.scope;
/**
* <b>Description:
* 	session级别的bean 
* 	一个回话创建一个bean
* </b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> bean-scope
* <br><b>PackageName:</b> com.usl.contoller
* <br><b>ClassName:</b> SessionClassBean
* <br><b>Date:</b> 2017年12月28日 下午9:03:25
*/

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

import com.bll.service.RequestScopeService;
import com.bll.service.ScopeService;
import com.bll.service.SessionScopeService;
import com.google.gson.Gson;

@SessionScope
@RestController
public class SessionClassBean {
	@Autowired
	private ScopeService scopeService;
//	@Autowired
//	private RequestScopeService requestScopeService;
	@Autowired
	private SessionScopeService sessionScopeService;
	public SessionClassBean(){
		System.out.println("我是session级别的bean,我被初始化");
	}
	
	@RequestMapping(value="/session/hash",method=RequestMethod.GET,produces="text/json;charset=utf-8")
	public String hash(){
		Gson gson = new Gson();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("hashCode", this.hashCode());
		map.put("scopeService", scopeService.hashCode());
//		map.put("requestScopeService", requestScopeService.hashCode());
		map.put("sessionScopeService", sessionScopeService.hashCode());
		//测试反向代理
		map.put("aop---requestScopeService", sessionScopeService.getRequestScopeService().hashCode());
		return gson.toJson(map);
	}


	
	
}
