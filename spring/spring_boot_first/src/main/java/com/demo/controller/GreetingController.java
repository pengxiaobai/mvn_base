package com.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring_boot_first
* <br><b>PackageName:</b> com.demo.controller
* <br><b>ClassName:</b> GreetingController
* <br><b>Date:</b> 2017年12月14日 下午11:42:33
*/
@RestController
public class GreetingController {
	private static final String template = "Hello,%s";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	public Greeting geeting(@RequestParam(value="name",
	defaultValue="World")String name){
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
