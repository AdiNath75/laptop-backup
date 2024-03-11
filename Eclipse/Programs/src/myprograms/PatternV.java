package myprograms;

public class PatternV {
	public static void main(String[] args) {
		
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(j==4)
				{
					System.out.print("|");
				}
				else if(i==4)
				{
					System.out.print("-");
				}
				else
				{
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}

}
