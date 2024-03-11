package encapsulation;

public class Mobile {
	String brand, name, imei, processor, colour;
	int camera, ram, storage;
	double price;
	
	Mobile(){}
	
	Mobile(String brand, String name, String imei, String processor, String colour, 
			int camera, int ram, int storage, double price)
	{
		this.brand = brand;
		this.name = name;
		this.imei = imei;
		this.processor = processor;
		this.colour = colour;
		this.camera = camera;
		this.ram = ram;
		this.storage = storage;
		this.price = price;
		System.out.println("Mobile Created");
	}
	
	Sim s1 = null;
	public void insertSIm(String sp, String type, String size,long no, String mode)
	{
		s1 = new Sim(sp, type,size,no,mode);
		System.out.println("SIM inserted Successfully");	
	}
	
	public void displayMobile()
	{
		System.out.println("*************************");
		System.out.println("Brand: "+brand);
		System.out.println("Name: "+name);
		System.out.println("IMEI: "+imei);
		System.out.println("Processor: "+processor);
		System.out.println("RAM: "+ram);
		System.out.println("Storage: "+storage);
		System.out.println("Colour: "+colour);
		System.out.println("Camera: "+camera);
		System.out.println("Price: "+price);
	}
	
	

}
