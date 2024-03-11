package myprograms;

public class NamePattern {
	public static void main(String[] args) {
		
		int n=5,x=n,y=n;
		
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<10;j++)
			{
				if(j==x||j==y || i==n/2+1 && j==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				x++;
				y++;
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
