package leetcodes;

public class RotatedBy2ON {
	public static void main(String[] args) {
		String str1 = "gvbpkxlpgdirbf";	
		String str2 = "bfgvbpkxlpgdir";
		int count = 0;
		if(str2.endsWith(str1.charAt(0) +""+ str1.charAt(1))) {
			for(int i=0;i<str1.length()-2;i++) {
				if(str1.charAt(i+2) == str2.charAt(i)) {
					count++;
				}
			}
			if(count == str1.length()-2) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
		else if(str1.endsWith(str2.charAt(0) +""+ str2.charAt(1))){
			for(int i=0;i<str1.length()-2;i++) {
				if(str1.charAt(i) == str2.charAt(i+2)) {
					count++;
				}
			}
			if(count == str1.length()-2) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
	}

}
