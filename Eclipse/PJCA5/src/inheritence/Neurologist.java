package inheritence;

public class Neurologist extends Doctor {
	
	String organ, specialization;
	
	Neurologist(){}
			
	Neurologist(String name, String degree, String hospital, String time, double fees,String organ, String specialization) {
		
		super(name, degree, hospital, time, fees);
		
		this.organ = organ;
		this.specialization = specialization;
	}
	
	public void displayNeuro()
	{
		displayDoctor();
		System.out.println("Organ: "+organ);
		System.out.println("Specialization: "+specialization);
		
	}

}
