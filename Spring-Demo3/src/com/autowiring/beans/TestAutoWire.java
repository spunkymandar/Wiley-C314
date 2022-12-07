package com.autowiring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeBean eb=(EmployeeBean)context.getBean("emp1");
		System.out.println(eb.getFullName());
		System.out.println(eb.getDepartmentBean2().getName());
	}

}
