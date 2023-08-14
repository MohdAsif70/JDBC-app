package FarEye;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDao {
	public static void createEmployee(employee empl) throws SQLException{
		Connection con = DB.connect();
		String query = Query.insert;
		PreparedStatement preparedStatement = con.prepareStatement(query);
		preparedStatement.setInt(1, empl.getid());
		preparedStatement.setString(2,empl.getename());
		preparedStatement.setString(3, empl.getemail());
		preparedStatement.setInt(4, empl.getsalary());
		System.out.println(preparedStatement);
		preparedStatement.executeUpdate();
		preparedStatement.close();
	}
	
	public static void updateEmployee(int eid,String ename) throws SQLException{
		Connection con = DB.connect();
		String query = Query.update;
		PreparedStatement preparedStatement = con.prepareStatement(query);
		preparedStatement.setInt(2,eid);
		preparedStatement.setString(1,ename);
		System.out.println(preparedStatement);
		preparedStatement.executeUpdate();
		preparedStatement.close();
	}
	
	public static ArrayList<employee> readEmployee() throws SQLException{
	 ArrayList<employee> empList = new ArrayList<employee>();
	 Connection con =DB.connect();
	 String query = Query.select;
	 Statement statement = con.prepareStatement(query);
	 ResultSet rs = statement.executeQuery(query);
	 
	 while(rs.next())
	 {
	 employee emp = new employee(rs.getInt("eid"),rs.getString("ename"),rs.getString("email"),rs.getInt("salary"));
	 empList.add(emp);
	}
	 statement.close();
	 return empList;
	}

	public static void deleteEmployee(int eid) throws SQLException {
		Connection con = DB.connect();
		String query = Query.delete;
		PreparedStatement statement = con.prepareStatement(query);
		statement.setInt(1,eid);
		System.out.println(statement);
		statement.executeUpdate();
		statement.close();
		
	}

	
	 
	 
	 
	 
	 
		
	}
	

