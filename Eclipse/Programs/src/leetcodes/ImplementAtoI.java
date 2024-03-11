package leetcodes;

public class ImplementAtoI {
	public static void main(String[] args) {
		String str = "1234";
		int num=0,count=0; 
		if(str.charAt(0) == '-') {
			for(int i=1;i<str.length();i++) {
				int a = str.charAt(i);
				if(a>=48 && a<=57) {
					num = num*10 + (str.charAt(i)-48);
					count++;
				}
			}
			if(count == str.length()-1) {
				System.out.println(-num);
			}
			else {
				System.out.println(-1);
			}
		}
		else {
			for(int i=0;i<str.length();i++) {
				int a = str.charAt(i);
				if(a>=48 && a<=57) {
					num = num*10 + (str.charAt(i)-48);
					count++;
				}
			}
			if(count == str.length()) {
				System.out.println(num);
			}
			else {
				System.out.println(-1);
			}
		}
		

	}

}
