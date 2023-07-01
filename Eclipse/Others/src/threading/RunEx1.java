package threading;

public class RunEx1 implements Runnable {
	
	public void run() {
		System.out.println("Thread is Running");
	}
	public static void main(String[] args) {
		RunEx1 r1=new RunEx1();    
        Thread t1 =new Thread(r1);    
        // this will call run() method   
        t1.start(); 
	}

}
