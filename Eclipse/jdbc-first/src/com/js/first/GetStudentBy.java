package com.js.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GetStudentBy {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Id to Get data");

		int id = in.nextInt();
		String url = "jdbc:mysql://localhost:3306/jdbc_first";
		String user = "root"; 
		String password = "Adi@7575";
		
		String query = "select * from student where id = "+id;
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection c = DriverManager.getConnection(url,user,password); 
			Statement st = c.createStatement(); 
			ResultSet rs = st.executeQuery(query);
			while(rs.next()){
				System.out.println("Id = "+rs.getInt(1));
				System.out.println("Name = "+rs.getString(2));
				System.out.println("Age = "+rs.getInt(3));
			}
			c.close(); 
		}
		catch(ClassNotFoundException e) {
				e.printStackTrace(); 
				} 
		catch(SQLException e) {
			e.printStackTrace(); 
			}
	}

}
