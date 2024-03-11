package com.multithreading.method.yield;

class Thread1 extends Thread{
	
	public void run() {
		String n = Thread.currentThread().getName();
		for (int i = 1; i <= 3; i++) {
			
			System.out.println(n);
			Thread.yield();		
		}
	}
}

class Thread2 extends Thread{
	
	public void run() {
		String n = Thread.currentThread().getName();
		for (int i = 1; i <= 3; i++) {
			
			System.out.println(n);
		}
	}
}

public class YieldDemo {
	
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();
		
	}

}
