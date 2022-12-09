import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Employee implements Externalizable{
	private int empId;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	private String empName;
	private double empSalary;
	transient private Date joiningDate;
	
	public Employee() {
		
	}
	public Employee(int empId, String empName, double empSalary, Date joiningDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.joiningDate = joiningDate;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", joiningDate="
				+ joiningDate + "]";
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeInt(this.empId);
		out.writeObject(this.empName);
		out.writeDouble(this.empSalary);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		this.empId=in.readInt();
		this.empName=(String)in.readObject();
		this.empSalary=in.readDouble();
		
		
	}
	
	
	
	
	

}
