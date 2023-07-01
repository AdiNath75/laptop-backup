package encapsulation;

public class ATMDriver {
	public static void main(String[] args) {
		ATM a1 = new ATM("SBI","DECCAN",75,100000);
		
		a1.setBalance(789123, 1245, 10000);
		
		System.out.println(a1.getBalanace(789456, 1245));
		
		a1.setBalance(789456, 1245, 10000);
		
		System.out.println(a1.getBalanace(789456, 1245));
		
		System.out.println(a1.getLocation());
		
		System.out.println(a1.getBankName());
		
		
		
		
		
	}

}
