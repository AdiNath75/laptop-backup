package inheritence;

public class CarLoan extends LoanAccount{
	
	String carDetail;
	double intrest,emi,carLoanAmount;
	int duration;
	
	CarLoan(){}
	
	CarLoan(String user, Long accno, String bank, String branch, String type,double loanAmount,int cibil,
			String carDetail,double intrest,double emi,double carLoanAmount,int duration)
	{
		super(user, accno, bank, branch, type, carLoanAmount, cibil);
		
		this.loanAmount = loanAmount;
		this.cibil = cibil;
		this.carDetail = carDetail;
		this.intrest = intrest;
		this.emi = emi;
		this.carLoanAmount = carLoanAmount;
		this.duration = duration;
	}
	
	public void displayCarLoan()
	{
		displayLoanAccount();
		System.out.println("Car details: "+carDetail);
		System.out.println("Intrest: "+intrest);
		System.out.println("EMI: "+emi);
		System.out.println("Car Loan Amount: "+carLoanAmount);
		System.out.println("Duration: "+duration);
	}
}
