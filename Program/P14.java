import java.util.Scanner;
class  P14
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of Five Subjects");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s4 = sc.nextInt();
		int s5 = sc.nextInt();
		float sum = (s1+s2+s3+s4+s5);
		float avg = sum/5;
		float percent = (sum/500)*100;
		System.out.println(avg);
		System.out.println(percent);
	}
}
