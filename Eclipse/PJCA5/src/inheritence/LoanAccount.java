package inheritence;

public class LoanAccount extends Account{
	
	double loanAmount;
	int cibil;
	
	LoanAccount(){}
	
	LoanAccount(String user, Long accno, String bank, String branch, String type,double loanAmount,int cibil)
	{
		super(user, accno, bank, branch, type);
		this.loanAmount = loanAmount;
		this.cibil = cibil;
	}
	
	public void displayLoanAccount()
	{
		displayAccount();
		System.out.println("Loan Amount: "+loanAmount);
		System.out.println("cibil: "+cibil);
	}

}
