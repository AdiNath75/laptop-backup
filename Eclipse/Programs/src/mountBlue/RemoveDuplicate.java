package mountBlue;

public class RemoveDuplicate {
	public static void main(String[] args) {
		
		char[] ar = {'a','d','g','h','a','h','y','d','r','b','g'};
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i] == ar[j]) {
					ar = removeDuplicateElements(ar,j);
				}
			}
		}	
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}
	
	static char[] removeDuplicateElements(char x[], int in)
	{  
       
		char y[]=new char[x.length-1]; 
		for(int i=0;i<y.length;i++)
		{
			if(i<in)
				y[i]=x[i]; 
			else
				y[i]=x[i+1];
		} 
		return y; 
		}
}
