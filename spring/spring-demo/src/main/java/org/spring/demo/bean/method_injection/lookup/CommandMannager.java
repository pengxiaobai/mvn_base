package org.spring.demo.bean.method_injection.lookup;

import org.spring.demo.bean.method_injection.Command;
import org.springframework.beans.factory.annotation.Lookup;

/**
* <b>Description: lookup 方法注入测试</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.method_injection.lookup
* <br><b>ClassName:</b> CommandMannager
* <br><b>Date:</b> 2017年12月25日 下午11:23:58
*/

public abstract class CommandMannager {

	public abstract Command createCommand();
}
