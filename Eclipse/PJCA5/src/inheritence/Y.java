package inheritence;

public class Y extends X {
	
	int s = 100;
	
	public void displayX()
	{
		System.out.println(123);	
	}
	
	public void displayY()
	{
		System.out.println(s);
		
		System.out.println(super.s);
				
		displayX();
		
		super.displayX();
	}
}
