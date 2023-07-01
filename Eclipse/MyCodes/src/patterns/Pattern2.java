package patterns;

public class Pattern2 {
	public static void main(String[] args) {
		int n = 6;
		for (int i = 1; i <= n; i++) {
			for(int j=1;j<=6;j++) {
				if(i==1 || j==1 || i==6 || j==6) {
					System.out.print("* ");
				}
				else {
					System.out.print(j-1+i+" ");
				}
			}
			System.out.println();
			
		}
	}
}
