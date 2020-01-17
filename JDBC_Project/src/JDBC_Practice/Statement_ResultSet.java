package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_ResultSet {
	
	public static void main(String[] args) throws SQLException {
		
		
		String userName = "hr";
		String passWord = "hr";
		
		// url syntax: jdbc:DataBaseType:thin:@Host:port:SID
		String url = "jdbc:oracle:thin:@54.166.75.182:1521:xe";
		
	// Connection Step	
	Connection  connection = DriverManager.getConnection(url, userName, passWord);
	
	System.out.println("Connection completed");
	
	
	// Statement step: 
	 		Statement  statement =	connection.createStatement();
	
	 		System.out.println("Statement is created");
	 		
	 		
	 //ResultSet:
	 		ResultSet  result = 	statement.executeQuery( "Select * From employees" );
	
	 		System.out.println("Result Set is completed");
	 		
	 		 String sql = "drop table developers";
	
	 		statement.executeUpdate(sql);
		
		
	}

}
