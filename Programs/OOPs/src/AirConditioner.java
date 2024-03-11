class AirConditioner 
{
	String brand;
	double price;
	String colour;
	double capacity;
	int min_temp;
	int max_temp;
	int ambient_temp;
	AirConditioner(){}
	
	AirConditioner(String brand, double price, String colour, double capacity, int min, int max, int ambient)
	{
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.capacity = capacity;
		min_temp = min;
		max_temp = max;
		ambient_temp = ambient;
	}
	public void displayDetails()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price+" Rs");
		System.out.println("Colour : "+colour);
		System.out.println("Capacity : "+capacity+" Tons");
	}
	public void displayMinTemp()
	{
		System.out.println("Minimum Temprature : "+min_temp+" *c");
	}
	public void displayMaxTemp()
	{
		System.out.println("Maximum Temprature : "+max_temp+" *c");
	}
	public void displayAmbientTemp()
	{
		System.out.println("Ambient Temprature : "+ambient_temp+" *c");
	}

}
