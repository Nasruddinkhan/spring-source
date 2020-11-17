package com.mypractice.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.mypractice.bean.Employee;

public class TestClient {
	public static void main(String[] args) {
		Resource res;
		res = new ClassPathResource("com/mypractice/cfg/application.xml");
		BeanFactory bean;
		bean = new XmlBeanFactory(res);
		Employee emp = bean.getBean("emp", Employee.class);
		System.out.println(emp);
	}
}
