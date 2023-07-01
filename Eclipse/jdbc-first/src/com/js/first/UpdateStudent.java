package com.js.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudent {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc_first";
		String user = "root"; 
		String password = "Adi@7575"; 
		String query = "update student set name='Xyz', age = 25 where id = 8";
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection c = DriverManager.getConnection(url,user,password); 
			Statement st = c.createStatement(); 
			st.execute(query);
			c.close(); 
			System.out.println("Updated"); 
		}
		catch(ClassNotFoundException e) {
				e.printStackTrace(); 
				} 
		catch(SQLException e) {
			e.printStackTrace(); 
			}
	}

}
