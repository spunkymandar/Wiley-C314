package com.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lazy loaded
//		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("emp.xml"));
//		System.out.println("BeanFactory loaded!!");
		//factory.getBean("emp1");
		
		//eagerly loaded
//		ApplicationContext context=
////				new ClassPathXmlApplicationContext("emp.xml","emp2.xml","emp3.xml");
//		ApplicationContext context=
//				new ClassPathXmlApplicationContext(new String[] {"emp.xml","emp1.xml","emp2.xml"});
		ApplicationContext context=
			new ClassPathXmlApplicationContext("emp.xml");
		System.out.println("Application Context loaded!!");
		Customer e1=(Customer)context.getBean("cust1");
		System.out.println(e1);
		

	}

}
