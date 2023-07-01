package com.multithreading.method.interrupt;

class A extends Thread {

	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("t1 thread running");
			
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
				System.out.println("t1 thread is terminated");
		}
		
	}
}


public class InterruptDemo {

	public static void main(String[] args) {

		A t1 = new A();

		t1.start();
		t1.interrupt();
	}

}
