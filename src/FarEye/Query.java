package FarEye;

public class Query {
	static String insert = "INSERT INTO employee (eid,ename,email,salary) VALUES (?,?,?,?);";
	static String update = "UPDATE employee SET ename=? where eid=?;";
	static String delete = "DELETE from employee where eid=?;";
	static String select = "select * from employee;";

}
