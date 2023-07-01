package numbers;

public class RootsOfQuadartic {
	public static void main(String[] args) {
		double D, x1, x2, rp, ip;
		
		double a=2.3, b=4,c=5.6;
		
		D = b*b-4*a*c;
		if(D >= 0) {
			
			System.out.println(Math.sqrt(25.0));;
			x1 = (-b + (Math.sqrt(D))) / (2*a);
			x2 = (-b - (Math.sqrt(D))) / (2*a);
			System.out.println(x1+" "+x2);
			System.out.println("x");
		}
		else {
			rp = -b /(2*a);
			ip = Math.sqrt(-D)/(2*a);
			float rp1,ip1;
			rp1 = (float) rp;ip1 = (float)ip;
			System.out.println("Root1 = " +rp1+"+j"+ip1);
			System.out.println("Root1 = " +rp1+"-j"+ip1);

		}
	}
}
