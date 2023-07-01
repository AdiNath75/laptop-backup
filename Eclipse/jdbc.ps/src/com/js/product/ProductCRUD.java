package com.js.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
public class ProductCRUD {
	String url = "jdbc:mysql://localhost:3306/jdbc_ps";
	// TODO Auto-generated method stub 
	String user = "root"; 
	String password = "Adi@7575";
	
	public void saveProduct(Product p) {
		String query = "insert into product values(?,?,?,?,?)";
		Connection c = null;
				try { 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			c = DriverManager.getConnection(url,user,password); 
			PreparedStatement ps = c.prepareStatement(query);
			ps.setInt(1, p.getId());
			
			ps.setString(2, p.getName());
			ps.setString(3, p.getBrand());
			ps.setInt(4, p.getQuantity());
			ps.setDouble(5, p.getPrice());
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
	public void deleteProduct(int id) {
		String query = "delete from product where id=?";
		Connection c = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			c = DriverManager.getConnection(url,user,password); 
			PreparedStatement ps = c.prepareStatement(query);
			ps.setInt(1, id);
			ps.execute();
			System.out.println("Deleted");
		}catch(ClassNotFoundException e) {
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
	
	public void updateProduct(int id , Product p) {
		ProductCRUD pc  = new ProductCRUD();
		boolean b = pc.getProductById(id);
		if(b) {
			String query = "update product set name=?,brand=?,quantity=?,price=? where id=?";
			Connection c = null ;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				c = DriverManager.getConnection(url, user, password);
				PreparedStatement ps = c.prepareStatement(query);
				ps.setString(1, p.getName());
				ps.setString(2, p.getBrand());
				ps.setInt(3,p.getQuantity());
				ps.setDouble(4,p.getPrice());
				ps.setInt(5, id);
				ps.execute();
				System.out.println("Updated");
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			finally {
				try {
					c.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else {
			System.out.println("No product with given id");
		}
	}
	
	public boolean getProductById(int id) {
		String query = "select * from product where id=?";
		Connection c = null ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = c.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;	
	}
	public boolean getAllProduct() {
		String query = "select * from product";
		Connection c = null ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = c.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("Product Id = "+rs.getInt(1));
				System.out.println("Product Name = "+rs.getString(2));
				System.out.println("Product Brand = "+rs.getString(3));
				System.out.println("Product Quantity = "+rs.getInt(4));
				System.out.println("Product Price = "+rs.getDouble(5));
				System.out.println("=======================");
			}
		}
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
	public void batchExecution(List<Product> Products) {
		String query = "insert into product values(?,?,?,?,?)";
		Connection c = null ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = c.prepareStatement(query);
			for (Product p : Products) {
				ps.setInt(1, p.getId());
				ps.setString(2, p.getName());
				ps.setString(3, p.getBrand());
				ps.setInt(4, p.getQuantity());
				ps.setDouble(5, p.getPrice());
				
				ps.addBatch();
			}
			ps.executeBatch();
			System.out.println("Done");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

