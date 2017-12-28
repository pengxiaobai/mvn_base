package com.bll.service;
/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> bean-scope
* <br><b>PackageName:</b> com.bll.service
* <br><b>ClassName:</b> SessionScopeService
* <br><b>Date:</b> 2017年12月28日 下午10:49:12
*/

public class SessionScopeService {
	private RequestScopeService requestScopeService;
	
	public SessionScopeService(){
		System.out.println("我是服务层session，初始化");
	}
	
	public RequestScopeService getRequestScopeService(){
		return  requestScopeService;
	}

	public void setRequestScopeService(RequestScopeService requestScopeService) {
		this.requestScopeService = requestScopeService;
	}
	
}
