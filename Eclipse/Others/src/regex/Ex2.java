package regex;

import java.util.regex.Pattern;

public class Ex2 {
	
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("ad.", "adi"));
		
		System.out.println(Pattern.matches("...", "adi"));
		
		System.out.println(Pattern.matches(".d", "adi"));
		
		System.out.println(Pattern.matches(".a.", "adi"));
		
		System.out.println(Pattern.matches("i..", "adi"));
	}

}
