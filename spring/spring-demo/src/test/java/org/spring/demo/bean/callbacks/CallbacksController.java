package org.spring.demo.bean.callbacks;

import org.springframework.context.Lifecycle;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.callbacks
* <br><b>ClassName:</b> CallbacksController
* <br><b>Date:</b> 2018年1月2日 下午11:08:17
*/

public class CallbacksController  implements Lifecycle {

	public CallbacksController(){
		System.out.println("我是构造器");
	}
	@Override
	public void start() {
		System.out.println("开始方法");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isRunning() {
		// TODO Auto-generated method stub
		return false;
	}

}
