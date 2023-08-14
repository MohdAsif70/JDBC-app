package FarEye;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {
	 while(true)
	 {
		 System.out.println("Enter the sql operation you want to do: Bebu");
		 System.out.println("1.create, 2.Read , 3. Update , 4. Delete ");
		 Scanner sc = new Scanner (System.in);
		 int choice = sc.nextInt();
		 
		 if(choice<1 || choice>=5)
		 {
		 System.out.println("You have entered wrong choice");
		 break;
		 }
		 switch(choice) {
		 case 1: System.out.println("id,name,email,salary");
		         int eid=sc.nextInt();
		         sc.nextLine();
		         String ename = sc.nextLine();
		         String email = sc.nextLine();
		         int salary = sc.nextInt();
		         employee emp = new employee(eid,ename,email,salary);
		         EmployeeDao.createEmployee(emp);
		         break;
		         
		 case 2: 
			 System.out.println("All employee details");
			 ArrayList<employee> List = EmployeeDao.readEmployee();
			 for (employee Employee: List)
			 {
				 System.out.print(Employee.getid()+ " ");
				 System.out.print(Employee.getename()+ " ");
				 System.out.print(Employee.getemail()+ " ");
				 System.out.println(Employee.getsalary()+ " ");
				 System.out.println("******Next Row******");
				 
			 }
			 break;
			 
		 case 3: 
			 System.out.println("eid,ename");
			 eid = sc.nextInt();
			 sc.nextLine();
			 ename = sc.nextLine();
			 EmployeeDao.updateEmployee(eid,ename);
			 break;
		 
		 case 4: 
			 System.out.println("id:");
			 eid=sc.nextInt();
			 EmployeeDao.deleteEmployee(eid);
			 break;
		 
			 
		 }
//		 sc.close();
		 }
		 

	}
}

