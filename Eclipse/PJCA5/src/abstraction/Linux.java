package abstraction;

public class Linux extends Calculator{
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	public void div(double a,double b)
	{
		System.out.println(a/b);
	}
	public void mul(int a, int b)
	{
		System.out.println(a*b);
	}

}
