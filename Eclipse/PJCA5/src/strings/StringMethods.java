package strings;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String s1 = "Adinath";

		System.out.println("s1.charAt(2): "+s1.charAt(2));
		
		System.out.println(s1.codePointAt(0));
		
		System.out.println(s1.codePointBefore(1));
		
		System.out.println(s1.codePointCount(1, 4));
		
		System.out.println(s1.compareTo("Adi"));
		
		System.out.println(s1.compareToIgnoreCase("adinath puri"));
		
		System.out.println(s1.concat(" Puri"));
		
		System.out.println(s1.contains("nath"));
		
		System.out.println(s1.contentEquals("Adinath"));
		
		System.out.println(s1.contentEquals("adinath"));
		
		System.out.println(String.valueOf("Adi"));
		
		//System.out.println(String.valueOf(null , 0, 3));
		
		System.out.println(s1.endsWith("th"));
		
		System.out.println(s1.equals("Adina"));
		
		System.out.println(s1.equalsIgnoreCase("adinath"));
		
		System.out.println(s1.getBytes());
		
		System.out.println(s1.hashCode());
		
		System.out.println(s1.indexOf('a'));
		
		System.out.println(s1.indexOf('d', 2));
		
		String s2 = "AbcaBcabCabc";
		System.out.println(s2);
		
		System.out.println(s2.indexOf("Cab"));
		
		System.out.println(s2.indexOf("ca", 4));
		
		System.out.println(s1.intern());
		
		System.out.println(s1.isEmpty());
		
		System.out.println(s2.lastIndexOf('c'));
		
		System.out.println(s2.lastIndexOf('c', 3));
		
		System.out.println(s2.length());
		
		System.out.println(s1.matches(s2));
		
		System.out.println(s2.replace('c', 'd'));
		
		System.out.println(s2.split("abc"));
		
		System.out.println(s2.subSequence(1, 5));
		
		System.out.println(s1.substring(3));
		
		System.out.println(s2.toCharArray());
		
		System.out.println(s2.toLowerCase());
				
		System.out.println(s2.toString());
		
		System.out.println(s2.toUpperCase());
		
		String s3 = "   asd   ";
		
		System.out.println(s3);
		
		System.out.println(s3.trim());
		
		boolean b1 = true;
		
		String s4 = String.valueOf(b1);
		
		System.out.println(s4);
		
		char c1 = 'A';
		
		String s5 = String.valueOf(c1);
		
		System.out.println(s5);
				
		char[] c2 = {'a','b','c','d','e','f','g'};
		
		String s6 = String.valueOf(c2);
		
		System.out.println(s6);
		
		String s7 = String.valueOf(c2, 1, 4);
		
		System.out.println(s7);
		
		double d1 = 123.456;
		
		String s8 = String.valueOf(d1);
		
		System.out.println("String.valueOf(d1): "+s8+123);
		
		float f1 = 456.123f;
		
		String s9 = String.valueOf(f1);
		
		System.out.println(s9+258);
		
		int n1 = 789;
		
		String s10 = String.valueOf(n1);
		
		System.out.println(s10+456);
		
		long l1 = 1234567890l;
		
		String s11 = String.valueOf(l1);
		
		System.out.println(s11+321);
		
		Object o1 = "ADI";
		
		String s12 = String.valueOf(o1);
		
		System.out.println(s12);
		
		System.out.println(s4+" "+s5+" "+s6+" "+s7+" "+s8+" "+s9+" "+
		s10+" "+s11+" "+s12);	
		
		System.out.println(String.copyValueOf(c2));
	}
}