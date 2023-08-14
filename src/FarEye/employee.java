package FarEye;

public class employee {
	int eid;
	String ename;
	String email;
	int salary;
	
	public employee(int eid,String ename,String email,int salary)
	{
		this.eid=eid;
		this.ename=ename;
		this.email=email;
		this.salary=salary;
	}
	
	public int getid()
	{
		return eid;
	}
	
	public String getename() {return ename;}
	public String getemail() {return email;}
	public int getsalary()
	{
		return salary;
	}
}