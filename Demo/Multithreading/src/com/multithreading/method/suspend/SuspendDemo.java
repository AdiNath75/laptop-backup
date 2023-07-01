package com.multithreading.method.suspend;


class A extends Thread{
	
	public void run() {
		
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 3; i++) {
			System.out.println(name);
		}
	}
}

public class SuspendDemo {

	@SuppressWarnings("removal")
	public static void main(String[] args) throws InterruptedException {
		
		A t1 = new A();
		A t2 = new A();
		A t3 = new A();

		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		
		t1.start();
		t2.start();
		t2.suspend();
		t3.start();
		t2.resume();
	}
}
