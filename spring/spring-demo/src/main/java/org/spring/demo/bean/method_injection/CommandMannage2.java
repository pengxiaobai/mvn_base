package org.spring.demo.bean.method_injection;
/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.method_injection
* <br><b>ClassName:</b> CommandMannage2
* <br><b>Date:</b> 2017年12月25日 下午10:54:39
*/

public class CommandMannage2 {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public Command getCommand() {
		return command;
	}
	
	
	
}
