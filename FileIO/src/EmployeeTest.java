import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Employee e1=new Employee(101,"Justin",67345, new Date(9,12,2022));
		
		FileOutputStream fos=new FileOutputStream("employee.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		System.out.println("Object is serialized");
		
//		
		FileInputStream fis=new FileInputStream("employee.dat");
		
			ObjectInputStream ois=new ObjectInputStream(fis);
			Employee e=(Employee)ois.readObject();
			System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getEmpSalary());
//		
		
		
//		e1.writeExternal(oos);
//		e1.readExternal(ois);

	}

}
