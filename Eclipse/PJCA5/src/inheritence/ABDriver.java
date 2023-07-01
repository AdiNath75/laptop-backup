package inheritence;

public class ABDriver {

	public static void main(String[] args) {
		
		A a1 = new A();
		
		System.out.println(a1.a);
		
		B b1 = new B();
		
		System.out.println(b1.d);
		
		System.out.println(b1.a);
		
	}
}