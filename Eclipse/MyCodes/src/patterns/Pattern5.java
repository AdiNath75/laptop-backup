package patterns;

public class Pattern5 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=6-i;j<6;j++) {
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
	}

}
