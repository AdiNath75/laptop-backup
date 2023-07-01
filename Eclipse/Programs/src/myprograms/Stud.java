package myprograms;

public class Stud {
	private int id;
	
	Stud(){}
	
	Stud(int id)
	{
		this.id = id ;
	}
	public int getId()
	{
		int i;
		for(i=2;i<id;i++)
		{
			if(id%i==0)
			{
				break;
			}	
		}
		if (id==i)
		{	
			return id;
		}
		else
		{
			return 0;
		}
	}
}
