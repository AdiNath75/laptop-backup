package com.multithreading.method.sleep;


class A extends Thread{
	
	public void run() {
		String n = Thread.currentThread().getName();
		for (int i = 1; i <= 3; i++) {
			
			try {
				System.out.println(n);
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class SleepDemo {
	
	public static void main(String[] args) {
		
		A t1 = new A();
		A t2 = new A();
		A t3 = new A();
		A t4 = new A();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		t4.setName("Thread 4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	
	}

}
