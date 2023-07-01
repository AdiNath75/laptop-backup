package wrapper;

public class W1 {
	
	public static void main(String[] args) {
		int a = 100;
		
		Integer i1 = new Integer(a); //Boxing
		
		System.out.println(i1);
		
		System.out.println(i1.toString()); 
		
		Double d1 = new Double(3.14); //Boxing
		
		System.out.println(d1.toString());
		
		int b = i1.intValue();
		
		System.out.println(b);
		
		double d2 = d1.doubleValue();
		
		System.out.println(d2);
	}

}
