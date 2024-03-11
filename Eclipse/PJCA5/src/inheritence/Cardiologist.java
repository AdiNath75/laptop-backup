package inheritence;

public class Cardiologist extends Doctor {
	
	String organ, specialization;
	
	Cardiologist(){}
			
	Cardiologist(String name, String degree, String hospital, String time, double fees,String organ, String specialization) {
		
		super(name,degree, hospital,time,fees);
		
		this.organ = organ;
		this.specialization = specialization;
	}
	
	public void displayCardio()
	{
		displayDoctor();
		System.out.println("Organ: "+organ);
		System.out.println("Specialization: "+specialization);
		
	}

}
