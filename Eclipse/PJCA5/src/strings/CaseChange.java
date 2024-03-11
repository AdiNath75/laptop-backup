package strings;

public class CaseChange {
	
	public static void main(String[] args) {
		
		String str = "AbQwErTyUiOpSdFgHjKlMnVcXz";
		String uc = toUpperCase(str);
		String lc = toLowerCase(str);
		System.out.println(str);
		System.out.println(uc);
		System.out.println(lc);
	}
	public static String toUpperCase(String str) {
		String st = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				char ch = (char)(str.charAt(i) - 32);
				st = st + ch;
			}
			else {
				st = st + str.charAt(i);
			}	
		}
		return st;
	}
	public static String toLowerCase(String str) {
		String st = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				char ch = (char)(str.charAt(i) + 32);
				st = st + ch;
			}
			else {
				st = st + str.charAt(i);
			}	
		}
		return st;
	}
}
