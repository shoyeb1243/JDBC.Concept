package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/program","root","root");
System.out.println("Created Connection");
String string="Insert into Engineer values(110,'dsjs','34563437','asjfjc')";
PreparedStatement cStatement=connection.prepareStatement(string);
cStatement.executeUpdate();
System.out.println("Inserted");

	String string2="select * from Engineer where id=101";
	PreparedStatement statement=connection.prepareStatement(string2);
	statement.executeQuery();	
	}
}
