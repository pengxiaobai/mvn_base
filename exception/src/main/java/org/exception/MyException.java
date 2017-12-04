package org.exception;
/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> exception
* <br><b>PackageName:</b> org.exception
* <br><b>ClassName:</b>MyException.java
* <br><b>Date:</b> 2017年12月4日 下午2:24:15
 */
public class MyException extends Exception {
	private int exceptionNum; //异常编号
	private String message;
	
	
	
	/**
	 *
	 * @Time:2017年12月4日 下午2:26:17
	 * @Username:Peng xh
	 * @Todo:两个参数的构造
	 * @param exceptionNum
	 * @param message
	 */
	public MyException(int exceptionNum, String message) {
		this.exceptionNum = exceptionNum;
		this.message = message;
	}

	/**
	 *
	 *@Time:2017年12月4日 下午2:24:26
	 *@Field:serialVersionUID
	 *@Todo:TODO
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "异常编号:"+this.exceptionNum+",异常信息:"+this.message;
	}
	
	
	
	

}
