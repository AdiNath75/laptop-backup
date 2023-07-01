package inheritence;

public class AppleDriver {
	public static void main(String[] args) {
		
		Fruit a1 = new Apple("Apple","Round","Red","Sweet",200,"Kashmir");
		
		a1.displayFruit();
		
		System.out.println("************************");
		
		Apple a2 = (Apple)a1;
				
		a2.displayApple();			
	}
}