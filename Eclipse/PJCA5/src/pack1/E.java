package pack1;

public class E {
	
	protected static String s = "Hii";
	
	protected char c = 'a';
	
	public static void main(String[] args) {
		
		System.out.println(s);
		
		E e1 = new E();
		
		System.out.println(e1.c);
		
		e1.a();
	}

	protected void a() {
		System.out.println("Protected method a()");		
	}

}
