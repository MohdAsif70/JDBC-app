package FarEye;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB 
{   
	public static Connection con=null;
	public static Connection connect() {
	try {
	String url= "jdbc:mysql://localhost:3306/";
	String DB= "student";
	String username="root";
	String password="Fatima@123";
	
	con = DriverManager.getConnection(url+DB,username,password);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return con;
}
}