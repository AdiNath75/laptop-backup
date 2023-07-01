package com.demo.thread;

public class B {

	public static void main(String[] args) throws InterruptedException {

		A thread = new A();
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("From main");
			Thread.sleep(1000);

		}

	}

}
