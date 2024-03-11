package strings;

public class ReplaceSubStr {
	
	public static void main(String[] args) {
		
		String str = "AbcaBcabCabc";
		char ch = 'c';
		char ch1 = 'd';
		int start = 4,end = 8;
		String ans = subSequence(str,start,end);
		String res = replace(str,ch,ch1);
		String st = subString(str,start);
		System.out.println(res);
		System.out.println(ans);
		System.out.println(st);
	}
	public static String replace(String str, char ch, char ch1) {
		String st = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ch) {
				st = st + ch1;
			}
			else {
				st = st + str.charAt(i);
			}
		}
		return st;
	}
	public static String subSequence(String str, int start, int end) {
		String st = "";
		for(int i=start;i<=end;i++) {
				st = st + str.charAt(i);
			}
		return st;
	}
	public static String subString(String str, int start) {
		String st = "";
		for(int i=start;i<str.length();i++) {
			st = st + str.charAt(i);
		}
		return st;
	}
}


