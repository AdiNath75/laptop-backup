package regex;
import java.util.regex.*;
public class Ex1 {
	
	public static void main(String[] args) {
		
		Pattern p = Pattern.compile(".d.");
		Matcher m = p.matcher("adi");
		
		boolean b = m.matches();
		System.out.println(b);
		
		boolean b2 = Pattern.compile("d.").matcher("adi").matches();
		
		System.out.println(b2);
		
		boolean b3 = Pattern.matches("d.", "adi");
		
		System.out.println(b3);
	}

}
