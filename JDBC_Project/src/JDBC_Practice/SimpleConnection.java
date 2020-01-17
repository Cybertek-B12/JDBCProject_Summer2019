package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnection {
	
	public static void main(String[] args) throws SQLException{
		
		String userName = "hr";
		String passWord = "hr";
		
		// url syntax: jdbc:DataBaseType:thin:@Host:port:SID
		String url = "jdbc:oracle:thin:@54.166.75.182:1521:xe";
		
		
	Connection  connection = DriverManager.getConnection(url, userName, passWord);
		
		System.out.println("Connect Successfully");
		
		
		
	}

}
