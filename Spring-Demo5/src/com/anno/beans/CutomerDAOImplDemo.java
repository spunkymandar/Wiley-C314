package com.anno.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CutomerDAOImplDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		CustomerDAO customerDAO=(CustomerDAO)context.getBean("customerDAOImpl");
		Customer c1=new Customer(111, "Keith Richardson");
		int ans=customerDAO.addCustomer(c1);
		if(ans>0)
			System.out.println("Record added successfully");

	}

}
