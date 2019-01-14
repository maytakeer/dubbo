package com.test;

import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements DemoService{

	@Override
	public String sayHello(String name) {
		
		return "aa:"+name;
	}

}
