package leetcodes;

public class KANgramsON {
	
	public static void main(String[] args) {
		
		String st1 = "wurkbxkgkfmlzofn";
		String st2 = "mczujslxzvhecrpy";
		int k=10;int count =0;
		if(st1.length() == st2.length()) {
			for(int i=0;i<st1.length();i++) {
				for(int j=0;j<st2.length();j++) {
					if(st1.charAt(i) == st2.charAt(j)) {
						count++;
					}
				}
			}
			if(count >= st1.length()-k) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
		else {
		System.out.println(0);
		}
	}

}
