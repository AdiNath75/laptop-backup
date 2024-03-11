package com.demo.thread;

public class ThreadSchedular {
	
	public static void main(String[] args) {
		AThreadSchedular t1 = new AThreadSchedular();
		AThreadSchedular t2 = new AThreadSchedular();
		AThreadSchedular t3 = new AThreadSchedular();
		 
		 t1.setName("Thread 1");
		 t2.setName("Thread 2");
		 t3.setName("Thread 3");
		 
		 t1.start();
		 t2.start();
		 t3.start();
		 
		 String st = Thread.currentThread().getName();
			for(int i=0;i<3;i++) {
				System.out.println(st);
			}
		 
	}

}

class AThreadSchedular extends Thread{
	
	public void run() {
		String st = Thread.currentThread().getName();
		for(int i=0;i<3;i++) {
			System.out.println(st);
		}
		
	}
}
