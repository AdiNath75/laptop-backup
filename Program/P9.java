import java.util.Scanner;
class  P9
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle ammount");
		int principle = sc.nextInt();
		System.out.println("Enter Rate of Interest");
		float interest = sc.nextFloat();
		float ammount = principle+(principle*interest/100);
		System.out.println(ammount);
	}
}
