import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Car;
import com.factory.CarFactory;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CarFactory cf=new CarFactory();
//		Car c=cf.buildCar();
//		System.out.println(c);
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Car c=(Car)context.getBean("carobj");
		System.out.println(c);
	}

}
