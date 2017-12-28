package com.usl.contoller.scope;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;

import com.google.gson.Gson;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> bean-scope
* <br><b>PackageName:</b> com.bll.service
* <br><b>ClassName:</b> ApplicationClassBean
* <br><b>Date:</b> 2017年12月28日 下午9:18:12
*/
@ApplicationScope
@RestController
public class ApplicationClassBean {
	
	public ApplicationClassBean(){
		System.out.println("我是application级别的bena,我被初始化了");
	}
	
	
	@RequestMapping(value="/application/hash",method=RequestMethod.GET,produces="text/json;charset=utf-8")
	public void hash(){
//		Gson gson = new Gson();
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("hash", this.hash());
//		return gson.toJson(map);
		System.out.println("application:"+this.hashCode());
	}
}
