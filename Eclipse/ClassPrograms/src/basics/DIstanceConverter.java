package basics;
import java.util.Scanner;

public class DIstanceConverter {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Conversion from below");
		System.out.println("1. MM to CM");
		System.out.println("2. CM to Inches");
		System.out.println("3. Inches to Foot");
		System.out.println("4. Foot to Meter");
		System.out.println("5. Meter to KM");
		System.out.println("6. Km to Miles");
		int num = sc.nextInt();
		System.out.println("Enter value to Convert from One to Another");
		int val = sc.nextInt();
		switch (num)
		{
		case 1:
			mmToCm(val);
			break;
		case 2:
			cmToInch(val);
			break;
		case 3:
			inchesToFoot(val);
			break;
		case 4:
			footToMeter(val);
			break;
		case 5:
			meterToKm(val);
			break;
		case 6:
			KmToMiles(val);
			break;
		default:
			System.out.println("Enter value from above Option");
		}
	}
	private static void inchesToFoot(int val) {
		double foot = val/12;
		System.out.println(val+":inch is "+foot+":foot");
	}
	private static void footToMeter(int val) {
		float ans = val/3.281f;
		System.out.println(val+":foot is "+ans+"meter");
	}
	private static void meterToKm(int meter) {
		double km = meter/1000;
		System.out.println(meter+": meters to km is"+km+"km");
	}
	private static void KmToMiles(int km) {
		double ans = km/1.609;
		System.out.println(km+":km is "+ans+ ":Miles");
	}
	public static void mmToCm(double num)
	{
		double ans = num*10;
		System.out.println(+num+"MM is "+ans+"CM");
	}
	public static void cmToInch(float a)
	{
		float res = a/2.54f;
		System.out.println(a+":CM is "+res+":Inch");
	}
}
