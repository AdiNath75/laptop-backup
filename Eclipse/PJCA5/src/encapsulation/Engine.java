package encapsulation;

public class Engine {
	int no_of_cy,stroke;
	double cc, hp;
	String cooling;
	
	Engine(){}
	
	Engine(int no_of_cy, double cc, int stroke, double hp, String cooling)
	{
		this.no_of_cy = no_of_cy;
		this.cc = cc;
		this.stroke = stroke;
		this.hp = hp;
		this.cooling = cooling;		
	}
	
	public void displayEngine()
	{
		System.out.println("Number of Cylinders: "+no_of_cy);
		System.out.println("cc: "+cc);
		System.out.println("HP: "+hp);
		System.out.println("Type of cooling:"+cooling);
		System.out.println("Stroke:"+stroke);
	}
}
