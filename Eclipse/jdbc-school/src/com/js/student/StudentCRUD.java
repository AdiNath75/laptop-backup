package com.js.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class StudentCRUD {
	String url = "jdbc:mysql://localhost:3306/jdbc_school";
	// TODO Auto-generated method stub 
	String user = "root"; 
	String password = "Adi@7575";
	
	public void saveProduct(Student s) {
		String query = "insert into student values(?,?,?,?)";
		Connection c = null;
				try { 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			c = DriverManager.getConnection(url,user,password); 
			PreparedStatement ps = c.prepareStatement(query);
			ps.setInt(1, s.getId());
			ps.setString(2, s.getName());
			ps.setString(3, s.getEmail());
			ps.setInt(4, s.getAge());
			ps.execute();
			}
		catch(ClassNotFoundException e) {
				e.printStackTrace(); 
				} 
		catch(SQLException e) {
			e.printStackTrace(); 
			}
				
	finally {
		try {
			c.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		}
	}
}
