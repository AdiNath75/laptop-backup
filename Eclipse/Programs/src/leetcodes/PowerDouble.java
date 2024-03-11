package leetcodes;

import java.util.Scanner;
public class PowerDouble {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double d = sc.nextDouble();
		int n = sc.nextInt();
		double ans = myPow(d,n);
		System.out.println(ans);
		
		sc.close();
	}
		public static double myPow(double x, int n) {
	        double pow = 1;
	        int t = n;
	        if(n<0) {
	        	n = - n;}
	        	for(int i=n;i>0;i--){
		            pow = pow *x;
		        }
	        	if(t>0) {return pow;
	        	}
	        	return 1/pow;
	}

}
