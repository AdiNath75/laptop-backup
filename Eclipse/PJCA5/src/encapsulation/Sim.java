package encapsulation;

public class Sim {
	String service, type, size, mode;
	long no;
	
	Sim(){}
	
	Sim(String sp, String type, String size,long no, String mode)
	{
		this.service = sp;
		this.type = type;
		this.size = size;
		this.no= no;
		this.mode = mode;
		System.out.println("Sim Created");
	}
	
	public void displaySim()
	{
		System.out.println("Service Provider: "+service);
		System.out.println("Type: "+type);
		System.out.println("Number: "+no);
		System.out.println("Size: "+size);
		System.out.println("Mode of Payment: "+mode);
	}

}
