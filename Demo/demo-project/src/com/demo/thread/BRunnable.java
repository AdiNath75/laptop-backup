package com.demo.thread;

public class BRunnable {
	
	public static void main(String[] args) throws InterruptedException {
		
		ARunnable a = new ARunnable();
		
		Thread t = new Thread(a);
		
		t.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("from main");
			Thread.sleep(1000);
		}
	}

}
