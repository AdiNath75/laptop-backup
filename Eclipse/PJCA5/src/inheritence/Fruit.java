package inheritence;

public class Fruit {
	String name,shape,colour,taste;
	double price;
	
	Fruit(){}
	
	Fruit(String name, String shape, String colour,String taste,double price)
	{
		this.name = name;
		this.shape = shape;
		this.colour = colour;
		this.taste = taste;
		this.price = price;
	}
	
	public void displayFruit()
	{
		System.out.println("Name: "+name);
		System.out.println("Shape: "+shape);
		System.out.println("Colour: "+colour);
		System.out.println("Taste: "+taste);
		System.out.println("Price: "+price);
	
	}
}
