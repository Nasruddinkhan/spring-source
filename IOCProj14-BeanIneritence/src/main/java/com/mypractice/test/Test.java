package com.mypractice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mypractice.bean.Car;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mypractice/cfg/application.xml");
		System.out.println(context);
		System.out.println(context.getBean("car1", Car.class));
		System.out.println(context.getBean("car2", Car.class));
		System.out.println(context.getBean("car3", Car.class));
	//	System.out.println(context.getBean("baseCar", Car.class));

	}

}
