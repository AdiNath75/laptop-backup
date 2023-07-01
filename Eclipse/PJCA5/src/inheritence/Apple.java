package inheritence;

public class Apple extends Fruit{
	
	String origin;
	
	Apple(){}
	
	Apple(String name, String shape, String colour,String taste,double price,String origin)
	{
		super(name, shape, colour, taste, price);
		this.origin = origin;
	}
	
	public void displayApple()
	{
		displayFruit();
		System.out.println("Origin: "+origin);
	}

}
