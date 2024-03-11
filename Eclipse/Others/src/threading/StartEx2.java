package threading;

public class StartEx2 implements Runnable {
	
	public void run() {
		System.out.println("From Thread is running");
	}
	
	public static void main(String[] args) {
		StartEx2 s2 = new StartEx2();
		
		Thread t1 = new StartEx1();
		t1.start();
	}

}
