package com.synchronization.demo;


class Bus implements Runnable{

	int available = 1, passanger;
	
	Bus(int passanger){
		this.passanger = passanger;
	}
	
	@Override
	public synchronized void run() {
		String name = Thread.currentThread().getName();
		if(available >= passanger) {
			System.out.println(name+" Reserved Seat..!");
			available--;
		}else {
			System.out.println("Sorry seat not available");
		}
	}	
}

public class SynchronizationDemo {
	
	public static void main(String[] args) {
		Bus b = new Bus(1);
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);
		
		t1.setName("Ram");
		t2.setName("Shyam");
		t3.setName("Raju");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
