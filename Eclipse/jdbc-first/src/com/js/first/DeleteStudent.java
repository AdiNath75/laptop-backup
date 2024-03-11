package com.js.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteStudent {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/jdbc_first";
		String user = "root"; 
		String password = "Adi@7575";
		System.out.println("Enter Id to be Delete");
		int id = in.nextInt();
		String query = "delete from student where id ="+id;
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection c = DriverManager.getConnection(url,user,password); 
			Statement st = c.createStatement(); 
			st.execute(query);
			c.close(); 
			System.out.println("Successfully Deleted"); 
		}
		catch(ClassNotFoundException e) {
				e.printStackTrace(); 
				} 
		catch(SQLException e) {
			e.printStackTrace(); 
			}
	}
}
