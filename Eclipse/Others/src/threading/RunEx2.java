package threading;

public class RunEx2 extends Thread {
	public void run() {
		System.out.println("Thread is Running");
	}
	public static void main(String[] args) {
		RunEx1 r1=new RunEx1(); 
		r1.run();
	}
}
