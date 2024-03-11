package strings;

public class InternEmpty {
	
	public static void main(String[] args) {
		
		String str = "Adinath";
		String ans = intern(str);
		boolean res = isEmpty(str);
		System.out.println(ans);
		System.out.println(res);
	}
	public static String intern(String str) {
		return str;
	}
	public static boolean isEmpty(String str) {
		if(str.length()>0) {
			return false;
		}
		return true;
	}

}
