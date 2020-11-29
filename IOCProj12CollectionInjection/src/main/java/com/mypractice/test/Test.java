package com.mypractice.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mypractice.bean.Company;
import com.mypractice.bean.EmployeeInfo;
import com.mypractice.bean.Resturant;
import com.mypractice.bean.SkillMaster;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/mypractice/cfg/application.xml");
		System.out.println(context);
		EmployeeInfo emp = context.getBean("empInfo", EmployeeInfo.class);
		System.out.println(emp);
		Resturant res = context.getBean("resturant", Resturant.class);
		System.out.println(res);
		Company comp = context.getBean("company", Company.class);
		System.out.println(comp);
		SkillMaster skilMst = context.getBean("skilMst", SkillMaster.class);
		System.out.println(skilMst);
		DefaultListableBeanFactory  factory=null;
		XmlBeanDefinitionReader reader=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/mypractice/cfg/application.xml");
		System.out.println(factory);
		emp = context.getBean("empInfo", EmployeeInfo.class);
		System.out.println(emp);
	}
}
