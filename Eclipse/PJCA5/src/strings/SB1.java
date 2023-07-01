package strings;

public class SB1 {
	
	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("Qspiders");
		
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer("Qspiders");
		
		System.out.println(s1.equals(s2));
		
		//StringBuffer s3 = "HII";
		
		StringBuffer s3 = s1.append("Deccan");
		
		System.out.println(s1);
		
		System.out.println(s3);
		
		String s4 = "Jspiders";
		
		System.out.println(s4);
		
		String s5 = s4.concat("Deccan");
		
		System.out.println(s5);
	}
}
