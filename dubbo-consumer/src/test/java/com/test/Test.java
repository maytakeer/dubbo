package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });
		context.start();
		DemoService demoService = (DemoService) context.getBean("demoService");
		System.out.println(demoService.sayHello("哈哈"));
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
