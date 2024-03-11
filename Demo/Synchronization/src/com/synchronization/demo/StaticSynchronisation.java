package com.synchronization.demo;

class Bank extends Thread{
	
	static int balance = 5000;
	static int withdraw;
	
	Bank(int withdraw){
		this.withdraw = withdraw;
	}
	
	public static synchronized void withdraw() {
		
		String name = Thread.currentThread().getName();
		if(withdraw <= balance) {
			System.out.println(name + " withdrawn money");
			balance = balance - withdraw;
		}else {
			System.out.println("Insufficient Balance");
		}
	}
	
	public void run() {
		withdraw();
	}
}

public class StaticSynchronisation {
	
	public static void main(String[] args) {
		
		Bank obj = new Bank(5000);
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		
		t1.setName("Raju");
		t2.setName("Sunita");
		
		Bank obj2 = new Bank(5000);
		
		Thread t3 = new Thread(obj2);
		Thread t4 = new Thread(obj2);
		
		t3.setName("Rahul");
		t4.setName("Anita");
		
		t1.start();  t2.start();
		
		t3.start();  t4.start();
		
	}

}
