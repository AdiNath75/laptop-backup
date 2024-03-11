package myprograms;

public class chair {
	
	String colour, material;
	double price;
	
	public chair() {
	}

	public chair(String colour, String material, double price) {
	
		this.colour = colour;
		this.material = material;
		this.price = price;
	}
	
	public void displayChair()
	{
		System.out.println(colour);
		System.out.println(price);
		System.out.println(material);
	}
}
