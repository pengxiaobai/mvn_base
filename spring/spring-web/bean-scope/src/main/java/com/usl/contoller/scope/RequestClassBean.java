package com.usl.contoller.scope;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.bll.service.RequestScopeService;
import com.bll.service.ScopeService;
import com.bll.service.SessionScopeService;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

/**
* <b>Description:   
* requst级别的bean
* 	每次请求后都重新创建一个bean
*</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> bean-scope
* <br><b>PackageName:</b> com.usl.contoller
* <br><b>ClassName:</b> RequestClassBean
* <br><b>Date:</b> 2017年12月27日 下午11:49:05
*/
@RequestScope
@RestController
public class RequestClassBean {
	@Autowired
	private ScopeService scopeService;
	@Autowired
	private RequestScopeService requestScopeService;
	@Autowired
	private SessionScopeService sessionScopeService;
	
	public RequestClassBean(){
		System.out.println("我是request级别的类，我被实例化了");
	}
	
	@RequestMapping(value="/request/hash",method=RequestMethod.GET,produces="text/json;charset=utf-8")
	public String hash(){
		Gson gson = new Gson();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("hashCode", this.hashCode());
		map.put("scopeService", scopeService.hashCode());
		map.put("requestScopeService", requestScopeService.hashCode());
		map.put("sessionScopeService", sessionScopeService.hashCode());
		//测试反向代理
		map.put("aop---requestScopeService", sessionScopeService.getRequestScopeService().hashCode());
		return gson.toJson(map);
	}
}
