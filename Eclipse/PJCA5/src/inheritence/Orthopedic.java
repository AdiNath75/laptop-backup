package inheritence;

public class Orthopedic extends Doctor {
	
	String organ, specialization;
	
	Orthopedic(){}

	Orthopedic(String name, String degree, String hospital, String time, double fees,String organ, String specialization) {
		
		super(name, degree, hospital, time, fees);
		
		this.organ = organ;
		this.specialization = specialization;
	}
	
	public void displayOrtho()
	{
		displayDoctor();
		System.out.println("Organ: "+organ);
		System.out.println("Specialization: "+specialization);
		
	}

}