package strings;

public class ValueOfStr {
	
	public static void main(String[] args) {
		
		char ch = 'A';int a=1,b=4;
		char[] ch1 = {'a','b','c','d','e','f','g'};
		double d = 123.456;
		float f = 456.321f;
		int n = 789;
		String st1 = valueOf(ch);
		String st2 = valueOf(ch1);
		String str3 = valueOf(ch1,a,b);
		String str4 = valueOf(d);
		String str5 = valueOf(f);
		String str6 = valueOf(n);
		System.out.println(st1+10);
		System.out.println(st2+123);
		System.out.println(str3);
		System.out.println(str4+1);
		System.out.println(str5+0);
		System.out.println(str6+12);
	}
	public static String valueOf(char ch) {
		String st = "";
		st = st + ch;
		return st;
	}
	public static String valueOf(char[] ch) {
		String st = "";
		for(int i=0;i<ch.length;i++) {
			st = st + ch[i];
		}
		return st;
	}
	public static String valueOf(char[] ch, int start, int end) {
		String st = "";
		for(int i=start;i<end;i++) {
			st = st + ch[i];
		}
		return st;
	}
	public static String valueOf(double d) {
		String st = "";
		st = st + d;
		return st;
	}
	public static String valueOf(float f) {
		String st = "";
		st = st + f;
		return st;
	}
	public static String valueOf(int n) {
		String st = "";
		st = st + n;
		return st;
	}
	
}
