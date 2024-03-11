package com.js.first;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement;
public class Student {
	public static void main(String[] args) { 
		String url = "jdbc:mysql://localhost:3306/jdbc_first";
		// TODO Auto-generated method stub 
		String user = "root"; 
		String password = "Adi@7575"; 
		String query = "insert into student values(8,'Abc',27)";
				try { 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection c = DriverManager.getConnection(url,user,password); 
			Statement st = c.createStatement(); 
			st.execute(query);
			c.close(); 
			System.out.println("student data saved"); 
			}
		catch(ClassNotFoundException e) {
				e.printStackTrace(); 
				} 
		catch(SQLException e) {
			e.printStackTrace(); 
			}
		}
	}

