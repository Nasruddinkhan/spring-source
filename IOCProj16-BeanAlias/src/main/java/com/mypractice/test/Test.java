package com.mypractice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mypractice.bean.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/mypractice/cfg/application.xml");
		System.out.println(applicationContext.getBean("permanentEmp", Employee.class));
	}
}
