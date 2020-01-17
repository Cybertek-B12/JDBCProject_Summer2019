package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrintingResult {

	public static void main(String[] args) throws SQLException {
		String userName = "hr";
		String passWord = "hr";
		String url = "jdbc:oracle:thin:@54.166.75.182:1521:xe";

		Connection  connection = DriverManager.getConnection(url, userName, passWord);
	
	 	Statement  statement =	connection.createStatement();
	
	 	ResultSet  result = statement.executeQuery( "Select * From employees" );
	
	 	while( result.next() ) {
	 		// String firstname = result.getString("first_name");
	 		// String lastname = result.getString("last_name");
	 		
	 		String firstname = result.getString(2);
	 		String lastname = result.getString(3);
	 		int salary	= result.getInt("salary");
	 		
	 		System.out.println(firstname +" "+lastname+"     $" +salary );
	 	}
	 	
		
		
		
	}

}
