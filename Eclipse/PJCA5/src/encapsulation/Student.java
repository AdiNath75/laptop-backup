package encapsulation;

public class Student {
	
	String name;
	long phno;
	Address add;
	
	
	Student(){}
	
	Student(String name,long phno,Address add)
	{
		this.name = name;
		this.phno = phno;
		this.add = add;
		System.out.println("Student Created");
	}
	
	public void displayStudent()
	{
		System.out.println("Name: "+name);
		System.out.println("Phone number: "+phno);
	}

}
