

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Car;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//		Customer customer=(Customer)context.getBean("cust");
//		System.out.println(customer);
		
		Car myCar1=(Car)context.getBean("car");
		System.out.println(myCar1);
		
		Car myCar2=(Car)context.getBean("car");
		System.out.println(myCar2);
		
		System.out.println("Color of first car is modified:");
		myCar1.setColor("Bakers Chocolate");
		
		System.out.println(myCar1);
		System.out.println(myCar2);
		

	}

}
