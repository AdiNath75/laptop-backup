package encapsulation;

public class StudentDriver {
	public static void main(String[] args) {
		
		Address a1 = new Address("A/B/9", "Gadiya Estate","Pune","MH",411038);
		
		Student s1 = new Student("Adinath",987654123, a1);
		
		s1.displayStudent();
		
		s1.add.displayAddress();
		
	}

}
