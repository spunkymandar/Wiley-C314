import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Employee1;

public class TestAddEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee1 e2=new Employee1(101,"David","Doe",45000);
		session.save(e2);
		
		
		System.out.println("Employee saved in database!!");
		
		transaction.commit();
		session.close();
		factory.close();
	}

}
