package JDBC_Practice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

import Utility.DBUtility;

public class ResultSet_Map {
	
	public static void main(String[] args) throws  SQLException {
		
		 ResultSet result  = DBUtility.getResult("select * from employees");
		 
		Map<String, Integer> EmployeeInfo = new LinkedHashMap<>();
		
		 while( result.next() ) {
			 String firstName = result.getString("first_name");
				String lastName = result.getString("last_name");
				
				String fullName = firstName+" "+lastName;
				int salary = result.getInt("salary");
				
				EmployeeInfo.put(fullName, salary);
				/*
				if(salary == 9000) {
					System.out.println(fullName+" is making 9000");
				}
				*/

		 }
		 
		 System.out.println(EmployeeInfo);
		 
		 System.out.println(  EmployeeInfo.get("Steven King") == 24000 );
		 
		 String sql = "Update developers set name = 'Madina' where name = 'Erhan'";
		
	}

}
