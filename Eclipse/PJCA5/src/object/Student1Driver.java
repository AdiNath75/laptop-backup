package object;

public class Student1Driver {
	
	public static void main(String[] args) {
		
		Student1 s1 = new Student1("Guldu", "Qspiders", "Deccan", "Male", 123);
		
		Student1 s2 = new Student1("Guldu", "Qspiders", "Deccan", "Male", 123);
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
	}

}
