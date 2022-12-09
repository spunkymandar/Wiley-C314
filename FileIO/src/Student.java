import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{
	String name;
	double gpa;
	transient Date dt;
	
	
	public Student(String name, double gpa, Date dt) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.dt = dt;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	public Date getDt() {
		return dt;
	}


	public void setDt(Date dt) {
		this.dt = dt;
	}
	
	
	private void writeObject(ObjectOutputStream oos)  {
		try {
		oos.defaultWriteObject();
		System.out.println(this.getDt().dd);
		oos.writeInt(this.getDt().getDd());
		oos.writeInt(this.getDt().getMm());
		oos.writeInt(this.getDt().getYy());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		this.dt=new Date(ois.readInt(),ois.readInt(),ois.readInt());		
	}

	public void print() {
		System.out.println(this.name+" "+this.gpa+" "+this.dt);
	}
}
