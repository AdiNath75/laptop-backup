package regex;

import java.util.regex.Pattern;

public class Ex4 {
	public static void main(String[] args) {
			System.out.println("? quantifier ....");
			System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)
			System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)
			System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)
			System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)
			System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)

			System.out.println("+ quantifier ....");
			System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)
			System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
			System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)
			System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)
			System.out.println(Pattern.matches("[amn]+", ""));

			System.out.println("* quantifier ....");
			System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)
			System.out.println(Pattern.matches("[amn]*", ""));
			System.out.println(Pattern.matches("[amn]*", "m"));
			System.out.println(Pattern.matches("[amn]*", "s"));
			
			System.out.println("{n} quantifier");//n characters 
			System.out.println(Pattern.matches("[a-h]{2}", "af"));
			System.out.println(Pattern.matches("[a-h]{2}", "a"));
			System.out.println(Pattern.matches("[a-h]{2}", "abc"));
			System.out.println(Pattern.matches("[a-h]{2}", "ay"));
			System.out.println(Pattern.matches("[abcd]{2}", "bc"));
			
			System.out.println("{n,}");//characters n or more than n times
			System.out.println(Pattern.matches("[a-h]{2,}", "af"));
			System.out.println(Pattern.matches("[a-h]{5,}", "abcd"));
			System.out.println(Pattern.matches("[a-h]{2,}", "abc"));
			System.out.println(Pattern.matches("[a-z]{5,}", "accdxnksncksa"));
			System.out.println(Pattern.matches("[abcd]{2,}", "bc"));
			System.out.println(Pattern.matches("[a-h]{2,}", "ay"));
			
			System.out.println("{x,y}");//characters more than x and less than y times
			System.out.println(Pattern.matches("[a-h]{2,5}", "acd"));
			System.out.println(Pattern.matches("[a-h]{2,5}", "abcdef"));
			System.out.println(Pattern.matches("[a-z]{3,6}", "ax"));
			System.out.println(Pattern.matches("[a-h]{2,5}", "abc"));
			System.out.println(Pattern.matches("[abcd]{2,4}", "bcd"));
			System.out.println(Pattern.matches("[a-h]{1,6}", "ay"));
	}
}
