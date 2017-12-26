package org.spring.demo.bean.method_injection.lookup.annotation;
/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.method_injection.lookup.annotation
* <br><b>ClassName:</b> LookUpAnnotaion
* <br><b>Date:</b> 2017年12月26日 下午9:18:25
*/

import org.spring.demo.bean.method_injection.Command;
import org.springframework.beans.factory.annotation.Lookup;

public abstract class LookUpAnnotaion {

	public Command retrunCommand(){
		return createCommand();
	}
	
	
	@Lookup("command")
	protected abstract Command createCommand();
}
