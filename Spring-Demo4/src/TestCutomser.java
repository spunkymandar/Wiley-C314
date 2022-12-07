

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.bean.Customer;

public class TestCutomser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Customer c=(Customer)context.getBean("customer123");
		System.out.println(c);
		System.out.println(c.getCustomerAddress().getAddressCity());
		System.out.println(c.getCustomerAddress().getAddressState());
		
	}

}
