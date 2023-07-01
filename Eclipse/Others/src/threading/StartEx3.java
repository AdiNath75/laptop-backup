package threading;

public class StartEx3 extends Thread{
	public void run() {
		System.out.println("First Thread is running");
	}
	public static void main(String[] args) {
		StartEx3 t1 = new StartEx3();
		t1.start();
		t1.start();
	}

}
