import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.LifeCycleBean;

public class LifeCycleBeanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		LifeCycleBean lcb=(LifeCycleBean)context.getBean("life");
		System.out.println("Bean loaded!!");
		//stopping spring container
		((AbstractApplicationContext)context).registerShutdownHook();
		
	}

}
