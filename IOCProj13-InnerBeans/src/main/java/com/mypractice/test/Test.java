package com.mypractice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mypractice.bean.Result;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mypractice/cfg/application.xml");
		System.out.println(context);
		Result result = context.getBean("result", Result.class);
		System.out.println(result.result());
		
	}
}
