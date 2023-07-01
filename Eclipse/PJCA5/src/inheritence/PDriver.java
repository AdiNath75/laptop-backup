package inheritence;

public class PDriver{
	public static void main(String[] args) {
		
		P.demo();
		
		P p1 = new P();
		
		System.out.println(p1.d);
		
		System.out.println(P.a);
		
		p1.test();
	}
}