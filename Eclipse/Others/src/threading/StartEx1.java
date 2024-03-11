package threading;

public class StartEx1 extends Thread {
	
	public void run() {
		System.out.println("From Thread is running");
	}
	
	public static void main(String[] args) {
		StartEx1 s1 = new StartEx1();
		
		s1.start();
	}

}
