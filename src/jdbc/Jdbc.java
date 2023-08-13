package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mumbai","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("select * from emp");
	ResultSet rSet= preparedStatement.executeQuery();
	
	while(rSet.next()) {
		
		String i=rSet.getString("id");
		System.out.println("Id : "+i);
		String nString=rSet.getString("name");
		System.out.println("Name : "+nString);
		String nString1=rSet.getString("address");
		System.out.println("Address : "+nString1);
		String nString2=rSet.getString("city");
		System.out.println("City : "+nString2);
		String nString3=rSet.getString("country");
		System.out.println("Contry : "+nString3);
		String nString4=rSet.getString("moNumber");
		System.out.println("Number : "+nString4);
		String nString5=rSet.getString("salary");
		System.out.println("Salary : "+nString5);
	}
	}

}
