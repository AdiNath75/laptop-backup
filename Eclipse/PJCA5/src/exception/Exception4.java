package exception;

public class Exception4 {
	
	public static void main(String[] args) {
		
		try {
			divide(10,0);
			divide1(10,0);
		} catch (Exception e) {
			System.out.println("Do not Divide Value by Zero");
		}
	}

	private static void divide1(int i, int j) {
		try {
			double ans  = i/j;
			System.out.println(ans);
		}	
		catch(Exception e1) {
			System.out.println("Do not Divide Value by Zero");
		}
	}
	

	private static void divide(int a, int b) {
		double ans  = a/b;
		System.out.println(ans);
		
	}
	
	
}
