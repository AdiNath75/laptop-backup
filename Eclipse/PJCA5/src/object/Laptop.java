package object;

public class Laptop {
	
		String brand,processor; 
		int ram;
		double screen,price;

		Laptop(){}

		Laptop(String brand, String processor, int ram, double screen, double price)
		{
			this.brand = brand;
			this.processor = processor;
			this.ram = ram;
			this.screen = screen;
			this.price = price;

		}
		public  void displayLaptop()
		{
			System.out.println("Brand : "+brand);
			System.out.println("Processor : "+processor);
			System.out.println("Ram : "+ram);
			System.out.println("Screeen : "+screen);
			System.out.println("Price : "+price);
			System.out.println("*********************");
		}
}
