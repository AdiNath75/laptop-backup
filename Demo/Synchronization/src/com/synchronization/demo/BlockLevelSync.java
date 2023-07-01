package com.synchronization.demo;

class Message {

	public void show(String name) {
		synchronized (this) {
			for (int i = 1; i <= 3; i++) {
				System.out.println("How are U : " + name);
			}
		}
	}
}

class MyThread1 extends Thread {

	Message m;
	String name;

	public MyThread1(Message m, String name) {
		this.m = m;
		this.name = name;
	}

	public void run() {
		 m.show(name);
	 }
}

public class BlockLevelSync {
	
	public static void main(String[] args) {
		
		Message m = new Message();
		MyThread1 t1 = new MyThread1(m, "Adi");
		MyThread1 t2 = new MyThread1(m, "Nath");
		
		t1.start(); t2.start();
	}

}
