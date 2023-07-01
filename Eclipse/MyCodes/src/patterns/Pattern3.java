package patterns;

public class Pattern3 {
	public static void main(String[] args) {
		int n=5, z=15;
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(z+" ");
				z--;
			}
			System.out.println();
		}
	}

}
