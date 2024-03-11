package leetcodes;

public class DSE2 {
	public static void main(String[] args) {
		int n=2;
		int m=2;
		int dec = 2;
		int k = 2;
		int num1=0;
		int num2=0;
		int num3=0;
		int num4 = 0;
		
		int a[][] = {{2,4},{3,5}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(j==1) {
					num1 = num1 + a[i][j];
				}
				else {
					num2 = num2 +a[i][j];
				}
			}
		}
		System.out.println(num1);
		System.out.println(num2);
		num3 = num1-dec;
		num4 = num2-dec;
		System.out.println(num3);
		System.out.println(num4);
		
	}

}
