package strings;

public class ValueOfEndsWith {
	
	public static void main(String[] args) {
		
		String str = "Adi";
		String st = "di23";
		boolean res = endsWith(str, st);
		
		String ans = valueOf(str);
		System.out.println(ans);
		System.out.println(res);
	}
	public static String valueOf(String str)
	{
		if(str.length() > 0)
		{
			return str;
		}
		return null;
	}
	public static boolean endsWith(String str, String st)
	{
		str = revStr(str);
		st = revStr(st);
		for(int i=0;i<str.length();) {
			if(str.charAt(i) == st.charAt(i)) {
				return true;
			}
			break;
		}
		return false;
		
	}
	public static String revStr(String str)
	{
		String rev ="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		return rev;
	}
}

