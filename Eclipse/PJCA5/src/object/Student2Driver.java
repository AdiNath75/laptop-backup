package object;

public class Student2Driver {
	
		public static void main(String[] args) {
		
		Student2 s1 = new Student2("Guldu", "Qspiders", "Deccan", "Male", 123);
		
		Student2 s2 = new Student2("Guldu", "Qspiders", "Deccan", "Male", 124);
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		
		System.out.println(s2.hashCode());
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		}

}
