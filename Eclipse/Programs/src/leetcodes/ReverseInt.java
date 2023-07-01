package leetcodes;

import java.util.Scanner;

public class ReverseInt {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			int ans = reverse(num);
			System.out.println(ans);
		}	
	}
	public static int reverse(int x) {
        int temp = x;
        int rev = 0;
        if (temp<0) {
        	for(int i=x;i<00;i/=10)
            {
                int rem = i%10;
                rev = rev *10 + rem;
            }
            return rev;
        }
        else {
        	for(int i=x;i>0;i/=10)
            {
                int rem = i%10;
                rev = rev *10 + rem;
                System.out.println(rev);
            }
            return rev;  
        }
    }
}
