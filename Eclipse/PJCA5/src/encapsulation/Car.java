package encapsulation;

public class Car {
	String brand,colour,name,type;
	double price;
	
	Engine e1 = new Engine(4, 1000, 4, 1.2, "Oil");
	
	Car(){}
	
	Car(String brand, String colour, String name, String type, double price)
	{
		this.brand = brand;
		this.colour = colour;
		this.name = name;
		this.type = type;
		this.price = price;
	}	
	
	public void displayCar()
	{
		System.out.println("********************");
		System.out.println("Brand: "+brand);
		System.out.println("colour: "+colour);
		System.out.println("Name: "+name);
		System.out.println("Type: "+type);
		System.out.println("Price: "+price);
	}
	
			

}
