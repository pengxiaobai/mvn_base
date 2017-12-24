package org.spring.demo.bean.instantiation.other;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
* <b>Description:集合类型测试</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.instantiation.other
* <br><b>ClassName:</b> CollectionsClass
* <br><b>Date:</b> 2017年12月24日 下午5:45:48
*/

public class CollectionsClass {
	private List list;
	private Set set;
	private Map map;
	private Properties properties;
	
	public void setList(List list) {
		this.list = list;
	}

	public List getList() {
		return list;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	
}
