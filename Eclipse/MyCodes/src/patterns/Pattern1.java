package patterns;

public class Pattern1 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(j+" ");
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j-1+" ");
			}
			System.out.println();
		}
	}

}
