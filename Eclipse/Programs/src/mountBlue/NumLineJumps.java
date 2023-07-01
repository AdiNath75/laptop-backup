package mountBlue;

public class NumLineJumps {
	public static void main(String[] args) {
		int x1 = 0;
		int v1 = 2;
		int x2 = 5;
		int v2 = 3;int n1 = x1,n2=x2;
		for(int i=0;;i++) {
			n1 = n1 + v1;
			n2 = n2 +v2;
			if(v1 > v2) {
				if(n1 == n2 ) {
					System.out.println("YES");
					break;
				}
				else if(n1  > n2) {
					System.out.println("No");
					break;
				}
			}
			else {
				if(n1 == n2 ) {
					System.out.println("YES");
					break;
				}
				else if(n1 < n2 ) {
					System.out.println("NO");
					break;
				}
			}
			
		}
		
				
	}

}
