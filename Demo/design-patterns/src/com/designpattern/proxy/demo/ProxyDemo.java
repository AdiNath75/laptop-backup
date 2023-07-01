package com.designpattern.proxy.demo;


interface DatabaseExecuter{
	public void executeDatabase(String query) throws Exception;
}

class DatabaseExecutorImpl implements DatabaseExecuter{

	@Override
	public void executeDatabase(String query) throws Exception {
		System.out.println("Executing query " +query);
	}
}

class DatabaseExecutorProxy implements DatabaseExecuter{
	
	boolean ifAdmin;
	DatabaseExecutorImpl dbExecutor;
	
	public DatabaseExecutorProxy(String name, String password) {
		if(name == "Admin" && password == "Admin@123"){
			ifAdmin = true;
			dbExecutor = new DatabaseExecutorImpl();
		}
	}

	@Override
	public void executeDatabase(String query) throws Exception {
		if(ifAdmin) {
			dbExecutor.executeDatabase(query);
		} else {
			if(query.equals("DELETE")){
				throw new Exception("DELETE not allowed for non-admin user");
			}else {
				dbExecutor.executeDatabase(query);
			}
		}
	}
}

public class ProxyDemo {
	
	public static void main(String[] args) throws Exception {
		
		DatabaseExecuter nonAdminExc = new DatabaseExecutorProxy("nonAdmin", "Admin@123");
		nonAdminExc.executeDatabase("DELETE");
		
		DatabaseExecuter adminExc = new DatabaseExecutorProxy("Admin", "Admin@123");
		adminExc.executeDatabase("DELETE");
	}

}
