package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CrudOperaction {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter User Id :");
		int id=scanner.nextInt();
		System.out.println("Enter UserName :");
		String name=scanner.next();
		System.out.println("Enter User Number :");
		String moNumber=scanner.next();
		System.out.println("Enter User Address :");
		String address=scanner.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/program","root","root");
		PreparedStatement pStatement=connection.prepareStatement("insert into Engineer values(?,?,?,?)");
		pStatement.setInt(1, id);
		pStatement.setString(2, name);
		pStatement.setString(3, moNumber);
		pStatement.setString(4, address);
	int rs= pStatement.executeUpdate();
		if(rs > 0) {
			 System.out.println("Successfully Inserted");
		}
		else {
			System.out.println("Oh Sit Yrr ");
		}
   
	}

}
