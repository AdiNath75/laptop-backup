package inheritence;

public class Account {
	
	String user, bank, branch, type;
	long accno;
	
	Account(){}
	
	Account(String user, Long accno, String bank, String branch, String type)
	{
		this.user = user;
		this.accno = accno;
		this.bank = bank;
		this.branch = branch;
		this.type = type;
	}
	
	public void displayAccount()
	{
		System.out.println("User: "+user);
		System.out.println("Accont number: "+accno);
		System.out.println("bank name "+bank);
		System.out.println("Branch "+branch);
		System.out.println("Type of account:"+type);
	}

}
