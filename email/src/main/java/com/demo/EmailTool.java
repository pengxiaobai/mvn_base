package com.demo;

import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.exception.MyException;

import com.sun.mail.util.MailSSLSocketFactory;

/**
 * 
* <b>Description:邮件工具</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> email
* <br><b>PackageName:</b> com.demo
* <br><b>ClassName:</b>EmailTool.java
* <br><b>Date:</b> 2017年12月4日 下午2:08:57
 */
public class EmailTool {
	private String  from; //邮件发送者
	private String password; //邮件发送者密码
	private String service; //邮件发送服务器
	private int port;//邮件服务器端口
	/**
	 * 
	 *构造器
	 * @Time:2017年12月4日 下午3:08:30
	 * @Username:Peng xh
	 * @Todo:TODO
	 * @param from 邮件发送者
	 * @param password 密码
	 * @param service 邮件服务器
	 * @param port 邮件服务器端口
	 * @throws MyException
	 */
	public EmailTool(String from,String password,String service,int port)throws MyException{
		if(null != from && !"".equals(from) 
				&& null != password && !"".equals(password)
				&& null != service && !"".equals(service)
				&& 0 < port){
			this.from = from;
			this.password = password;
			this.service = service;
			this.port = port;
		}else{
			throw new MyException(-1,"参数为空");
		}
	}
	
	
	private Session createSession()throws Exception{
		Session session = null;
		
		Properties properties = new Properties();
		//设置服务器地址
		properties.setProperty("mail.smtp.host", this.service);
		//设置端口
		properties.setProperty("mail.smtp.port", String.valueOf(this.port));
		//设置验证
		properties.put("mail.smtp.auth", "true");
		try {
			MailSSLSocketFactory sf = new MailSSLSocketFactory();
			sf.setTrustAllHosts(true);
	        properties.put("mail.smtp.ssl.enable", "true");
	        properties.put("mail.smtp.ssl.socketFactory", sf);
	        session = Session.getDefaultInstance(properties,new Authenticator(){
		            public PasswordAuthentication getPasswordAuthentication()
		            {
		                return new PasswordAuthentication(from, "ezzwkyitdjzabgba"); //发件人邮件用户名、密码
		            }
		    });
		} catch (GeneralSecurityException e) {
			throw new MyException(-2,e.getMessage());
		}
		return session;
	}
	
	
	/**
	* 
	* <b>Description:发送邮件</b><br> 
	* @param to 邮件接收者
	* @param title 邮件主题
	* @param content 邮件内容
	* @return false:发送失败   true:发送成功
	* @throws Exception
	* @Exception 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月4日 下午2:33:29
	* <br><b>Version:</b> 1.0
	 */
	public  boolean send(String to,String title,String content) throws Exception{
		boolean flag = false;
		
		if(null != to && !"".equals(to)){
			MimeMessage message = new MimeMessage(createSession());
			//设置发送人
			message.setFrom(new InternetAddress(from));
			//设置接收者
			message.addRecipient(RecipientType.TO, new InternetAddress(to));
			//设置邮件的主题
			message.setSubject(title);
			//设置邮件内容
			message.setText(content);
			//发送邮件
			Transport.send(message);
			flag = true;
		}else{
			throw new MyException(-1, "参数为空");
		}
		return flag;
		
	}

	public String getFrom() {
		return from;
	}

	public String getPassword() {
		return password;
	}

	public String getService() {
		return service;
	}
	public int getPort() {
		return port;
	}
}
