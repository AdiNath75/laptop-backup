package inheritence;

public class CarDriver {
	
	public static void main(String[] args) {
		
		Account c1 = new CarLoan("Macha",987456214l,"SBI","Deccan","Savings Account",1000000,43,"MH 12 A 1234",12,
				10000,500000,3);
		
		c1.displayAccount();
		System.out.println("********************");
		 
		LoanAccount l1 = (LoanAccount)c1;
		l1.displayLoanAccount();
		System.out.println("********************");

		
		CarLoan c2 = (CarLoan)c1;
		c2.displayCarLoan();
		System.out.println("********************");
		
	}

}
