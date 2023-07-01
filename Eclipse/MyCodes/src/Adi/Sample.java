package Adi;

public class Sample {
	 public static void main(String[] args) {
		String str = "asdfghj";
		int p = 2;
		System.out.println(charRemoveAt(str,p));
		System.out.println(str.substring(0, p));
		System.out.println(str.substring(p + 1));
		
	}
	 public static String charRemoveAt(String str, int p) {  
		   return str.substring(0, p) + str.substring(p + 1); 
	}

}