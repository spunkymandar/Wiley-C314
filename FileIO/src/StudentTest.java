import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student s=new Student("Justin",8.5,new Date(9,12,2022));
		s.print();
		FileOutputStream fos=new FileOutputStream("student.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		
		oos.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream("student.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student mystudent=(Student)ois.readObject();
		
		mystudent.print();

	}

}
