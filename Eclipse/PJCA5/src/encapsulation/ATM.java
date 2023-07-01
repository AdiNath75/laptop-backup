package encapsulation;

public class ATM {
	private String bank, location;
	private int id;
	private double money;
	
	ATM(){}
	
	ATM(String bank, String location, int id, double money)
	{
		this.bank = bank;
		this.location = location;
		this.setId(id);
		this.money = money;
	}
	
	public String getBankName()
	{
		return bank;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public double getBalanace(int accno,int pin)
	{
		int acno = 789456;
		int pin1 = 1245;
		if(accno==acno && pin==pin1)
		{
			return money;
		}
		else
		{
			System.out.println("Invalid User Details");
			return 0.0;
		}
	}
	public void setBalance(int accno, int pin,double ammount)
	{
		int acno = 789456;
		int pin1 = 1245;
		if(accno==acno && pin==pin1)
		{
			if (money>=ammount)
			{
				money = money - ammount;
				System.out.println("Ammount Withdrawan Successful");
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
		}
		else
		{
			System.out.println("Inavlid Account Details");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
