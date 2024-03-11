package inheritence;

public class Doctor {
	String name, degree, hospital, time;
	double fees;
	
	Doctor(){}

	public Doctor(String name, String degree, String hospital, String time, double fees) {
	
		this.name = name;
		this.degree = degree;
		this.hospital = hospital;
		this.time = time;
		this.fees = fees;
	}
	
	public void displayDoctor()
	{
		System.out.println("Name: "+name);
		System.out.println("Degree: "+degree);
		System.out.println("Hospital: "+hospital);
		System.out.println("Time: "+time);
		System.out.println("Fees: "+fees);
	}
	

}
