package strings;

public class LastIndex {
	
	public static void main(String[] args) {
		String st = "    Abca Bca bCabc    ";
		String str = trim(st);
		System.out.println(str);
		char ch = 'c';
		int ind = 3;
		int index = lastIndex(str,ch);
		int index2 = lastIndex(str, ch, ind);
		System.out.println(index);
		System.out.println(index2);
	}
	public static int lastIndex(String str, char ch) {
		int index = -1;
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i) == ch) {
				return i;
			}
		}
		return index;
	}
	public static int lastIndex(String str, char ch, int ind) {
		int index = -1;
		for(int i=ind;i<str.length();i++) {
			if(str.charAt(i) == ch)
				return i-ind;
		}
		return index;
	}
	public static String trim(String str) {
		int start=0, end=0;
		char ch = ' ';
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ch) {	
			}
			else {
				start = i;
				break;
			}
		}
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i) == ch) {	
			}
			else {
				end = i;
				break;
			}
		}
		String st = subSequence(str,start,end);
		return st;
	}
	public static String subSequence(String str, int start, int end) {
		String st = "";
		for(int i=start;i<=end;i++) {
				st = st + str.charAt(i);
			}
		return st;
	}
}
