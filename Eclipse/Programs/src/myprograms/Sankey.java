package myprograms;

public class Sankey {
	
	public static void main(String[] args) {
		
		String str1 = "Adi";
		
		String str = "N";
		
		str = str.replaceAll("N","NNNNNNNNNN" );
		str = str.replaceAll("N", "NNNNNNNNNN"); 

		
		str = str.replaceAll("N", str1 + "\n");
		
		System.out.print(str);
	}
}
