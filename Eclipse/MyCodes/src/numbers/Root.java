package numbers;

public class Root {

		public static void root(int num)
		{
			int i;
			for ( i=1;i<num/2 ;i++ )
			{
				if (num%i==0)
				{
					int root = i*i;
					if (num==root)
					{
						System.out.println(i);
						break;
					}
				}
			}
			if(i==num/2) {
				System.out.println("Not found");
			}
		}
		public static void main(String[] args) 
		{
			int num = 100;
			root(num);
		}
	

}
