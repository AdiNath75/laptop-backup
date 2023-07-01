package exception;

public class Exception3 {
	
	public static void main(String[] args) {
		
		try {
			int ans = 10/0;
			System.out.println(ans);
			
		} catch (ArithmeticException e) {
			System.out.println("Enter valid Input");
		}
		finally {
			System.out.println("Thank You!");
		}
	}

}
