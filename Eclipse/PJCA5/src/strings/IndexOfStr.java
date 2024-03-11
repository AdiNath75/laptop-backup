package strings;

public class IndexOfStr {
	
	public static void main(String[] args) {
		
		String str = "Adinath";
		String str2 = "AbcaBcabCabc";
		char ch = 'd';
		int ind = 3;
		String st = "ca";
		int ans = indexOf(str,ch);
		int res = indexOf(str,ch,ind);
		int index = indexOf(str2,st);
		int index2 = indexOf(str2,st,ind);
		System.out.println(ans);
		System.out.println(res);
		System.out.println(index);
		System.out.println(index2);
	}
	public static int indexOf(String str, char ch) {
		int index = -1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ch) {
				return i;
			}
		}
		return index;
	}
	public static int indexOf(String str, char ch, int ind) {
		int index = -1;
		for(int i=ind;i<str.length();i++) {
			if(str.charAt(i) == ch) {
				return i;
			}
		}
		return index;
	}
	public static int indexOf(String str, String st) {
		int index = -1;
		if(ContainStr.contains(str, st)) {
			int j=0,cnt=0;
			int i;
			for(i=0;i<str.length();i++) {
				if(str.charAt(i) == st.charAt(j)) {
					j++;cnt++;
					if(j==st.length()) {
						break;}
				}
			}
			if(j == st.length())
			{
				return i-cnt+1;
			}
		}
		return index;
	}
	public static int indexOf(String str, String st,int ind) {
		int index = -1;
		if(ContainStr.contains(str, st)) {
			int j=0,cnt=0;
			int i;
			for(i=ind;i<str.length();i++) {
				if(str.charAt(i) == st.charAt(j)) {
					j++;cnt++;
					if(j==st.length()) {
						break;}
				}
			}
			if(j == st.length())
			{
				return i-cnt+1;
			}
		}
		return index;
	}

}
