package object;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Guldu", "Qspiders", "Deccan", "Male", 123);
		
		System.out.println(s1);
		
		System.out.println("*******************");
		
		s1.displayStudent();
		
		System.out.println("********************");
		
		Student s2 = new Student();
		
		System.out.println(s2);
		
		System.out.println("********************");
		
		s2.displayStudent();
		
	}

}
