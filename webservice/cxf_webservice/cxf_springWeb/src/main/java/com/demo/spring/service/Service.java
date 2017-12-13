package com.demo.spring.service;


import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> cxf_springWeb
* <br><b>PackageName:</b> com.demo.spring.service
* <br><b>ClassName:</b>Service.java
* <br><b>Date:</b> 2017年12月13日 下午6:01:56
 */
public class Service {
	 protected Service() throws Exception {
	        System.out.println("Starting Server");

	        /**
	         * Important: This code simply starts up a servlet container and adds
	         * the web application in src/webapp to it. Normally you would be using
	         * Jetty or Tomcat and have the webapp packaged as a WAR. This is simply
	         * as a convenience so you do not need to configure your servlet
	         * container to see CXF in action!
	         */
	        org.eclipse.jetty.server.Server server = new org.eclipse.jetty.server.Server(9002);

	        WebAppContext webappcontext = new WebAppContext();
	        webappcontext.setContextPath("/");

	        webappcontext.setWar("target/JavaFirstSpringSupport.war");

	        HandlerCollection handlers = new HandlerCollection();
	        handlers.setHandlers(new Handler[] {webappcontext, new DefaultHandler()});

	        server.setHandler(handlers);
	        server.start();
	        System.out.println("Server ready...");
	        server.join();
	    }

	    public static void main(String args[]) throws Exception {
	        new Service();
	    }

}
