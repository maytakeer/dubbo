package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
		context.start();
		System.out.println("Dubbo provider start...");
		try {
			System.in.read();//按任意键退出
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
