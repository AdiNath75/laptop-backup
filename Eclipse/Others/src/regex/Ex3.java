package regex;

import java.util.regex.Pattern;

public class Ex3 {
	
	public static void main(String[] args) {
		System.out.println("[abc]");//a or b or c
		System.out.println(Pattern.matches("[amn]", "abcd"));
		System.out.println(Pattern.matches("[amn]", "a")); 
		System.out.println(Pattern.matches("[amn]", "ammmna"));
		System.out.println(Pattern.matches("[adi]", "d"));
		
		System.out.println("[^abc]");//except a or m or n
		System.out.println(Pattern.matches("[^abc]","s"));
		System.out.println(Pattern.matches("[^abc]","A"));
		System.out.println(Pattern.matches("[^abc]","a"));
		System.out.println(Pattern.matches("[^abc]", "sd"));
		
		System.out.println("[a-zA-Z]");//range from a to z or A to Z
		System.out.println(Pattern.matches("[a-zA-Z]", "a"));
		System.out.println(Pattern.matches("[a-zA-Z]", "G"));
		System.out.println(Pattern.matches("[a-zA-Z]", "as"));
		System.out.println(Pattern.matches("[a-zA-Z]", "0"));
		
		System.out.println("[a-d[m-p]]"); //range a to d or m to p
		System.out.println(Pattern.matches("[a-d[m-p]]","b"));		
		System.out.println(Pattern.matches("[a-d[m-p]]","o"));	
		System.out.println(Pattern.matches("[a-d[m-p]]","f"));
		System.out.println(Pattern.matches("[a-d[m-p]]","t"));		
		
		System.out.println("[a-z&&[def]]");//d,e,f (intersection)
		System.out.println(Pattern.matches("[a-z&&[def]]", "d"));
		System.out.println(Pattern.matches("[a-z&&[def]]", "a"));
		System.out.println(Pattern.matches("[a-z&&[def]]", "g"));
		
		System.out.println("[a-z&&[^bc]"); //range a to z except b, c
		System.out.println(Pattern.matches("[a-z&&[^bc]]","d"));
		System.out.println(Pattern.matches("[a-z&&[^bc]]","z"));
		System.out.println(Pattern.matches("[a-z&&[^bc]]","b"));
		
		System.out.println("[a-z&&[^m-t]]");// range a to z except m to t
		System.out.println(Pattern.matches("[a-z&&[^m-t]]", "h"));
		System.out.println(Pattern.matches("[a-z&&[^m-t]]", "v"));
		System.out.println(Pattern.matches("[a-z&&[^m-t]]", "o"));
	}
}
