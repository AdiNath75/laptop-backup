package wrapper;

public class W4 {
	
	public static void main(String[] args) {
		
		String s1 = "123";
		
		short sh = Short.parseShort(s1);
		
		System.out.println(sh+12);
		
		String s2 = "true";
		
		boolean b1 = Boolean.parseBoolean(s2);
		
		System.out.println(b1);
		
		String s3 = "i";
		
		char c1 = s3.charAt(0);
		
		System.out.println(c1);
	}

}
