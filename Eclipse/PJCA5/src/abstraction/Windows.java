package abstraction;

public class Windows extends Calculator {
	
	public void add(int a, int b)
	{
		int res = a+b;
		System.out.println(res);
	}
	public void sub(int a, int b)
	{
		int res = a-b;
		System.out.println(res);
	}
	public void div(double a,double b)
	{
		double ans = a/b;
		System.out.println(ans);
	}
	public void mul(int a, int b)
	{
		int res = a*b;
		System.out.println(res);
	}

}
