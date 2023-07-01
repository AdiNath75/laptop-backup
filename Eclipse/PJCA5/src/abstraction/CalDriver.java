package abstraction;

public class CalDriver {
	
	public static void main(String[] args) {
		
		Windows w1 = new Windows();
		
		w1.add(10,20);
		
		w1.sub(30, 10);
		
		Linux l1 = new Linux();
		
		l1.div(121, 11);
		
		l1.mul(10, 12);
	}

}
