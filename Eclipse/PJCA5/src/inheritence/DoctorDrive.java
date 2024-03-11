package inheritence;

public class DoctorDrive {
	
	public static void main(String[] args) {
		
		Doctor c1 = new Cardiologist("Sundra", "MBBS", "AIMS", "11:00 to 6:00", 600, "Heart", "MD");//upcasting
		
		c1.displayDoctor();
		System.out.println("------------------");
		//c1.displayCardio();
		Cardiologist c2 = (Cardiologist)c1;//downcating	
		c2.displayCardio();
		System.out.println("------------------");
		
		Doctor o1 = new Orthopedic("Macha", "MBBS", "Manipal", "9:00 to 1:00",500 , "Bone", "MD");
		
		o1.displayDoctor();
		System.out.println("------------------");
		Orthopedic o2 = (Orthopedic)o1;
		o2.displayOrtho();
		System.out.println("------------------");
		
		Doctor n1= new Neurologist("Machi", "MBBS", "D.Y. Patil", "10:00 to 4:0",700, "Brain", "MD");
		
		n1.displayDoctor();
		System.out.println("------------------");
		Neurologist n2 = (Neurologist)n1;
		n2.displayNeuro();
		System.out.println("------------------");
	}
}
