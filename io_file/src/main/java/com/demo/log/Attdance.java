package com.demo.log;
/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> io_file
* <br><b>PackageName:</b> com.demo.log
* <br><b>ClassName:</b>Attdance.java
* <br><b>Date:</b> 2017年12月12日 下午1:05:02
 */
public class Attdance {
	private String status;
	private String deviceId;
	private String cardNum;
	private String operTime;
	private String submitTime;
	
	
	
	/**
	 *
	 * @Time:2017年12月12日 下午2:14:42
	 * @Username:Peng xh
	 * @Todo:TODO
	 * @param status
	 * @param deviceId
	 * @param cardNum
	 * @param operTime
	 * @param submitTime
	 */
	public Attdance(String status, String deviceId, String cardNum, String operTime, String submitTime) {
		this.status = status;
		this.deviceId = deviceId;
		this.cardNum = cardNum;
		this.operTime = operTime;
		this.submitTime = submitTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getOperTime() {
		return operTime;
	}
	public void setOperTime(String operTime) {
		this.operTime = operTime;
	}
	public String getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}
}
