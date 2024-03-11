package leetcodes;

public class ReFormating {
	public static void main(String[] args) {
		
		String str = "5F3Z-2e-9-w"; int K = 4;
		int count =0;
		String st1 = "";
		
		for(int i=0;i<str.length();i++) {
			count++;
			if(str.charAt(i) == '-') {
				break;
			}
		}
		System.out.println(count);
		String arr[] = str.split("-");
		for(int i=1;i<arr.length;i++) {
			st1 = st1 + arr[i];
		}
		System.out.println(st1);
		String st2 = arr[0]+"-";
		String st3 ="";
		for(int i=0;i<st1.length();i+=K){
			for(int j=i;j<i+K;j++) {
				st3 = st3 +""+ st1.charAt(j);
			}
		st3 = st3 + "" +"-";
		}
		st2 = st2 + st3;
		String st4 = "";
		for(int i=0;i<st2.length()-1;i++) {
			st4 = st4 + "" + st2.charAt(i);
		}
		
		System.out.println(st4.toUpperCase());
	}

}
