package basics;

public class asdfg {
	public static void main(String[] args) {
		int n=18;
		int b=0;
		int i=0;
		while(n>=1) {
			b=b+(n%2)*2^i;
			n=n/2;
			i=i+2;
		}
		System.out.println(b);
	}
	
	

}
