package myprograms;

public class Student {
	static String name, addres;
	String birth;
	static int rollno;
	int passout;
	
	Student(){}
	
	public Student(String name,String birth,int passout) {
	
		this.birth = birth;
		this.passout = passout;
		Student.name = name;
	}
	public void displayStudent()
	{
		System.out.println(name);
		System.out.println(birth);
		System.out.println(passout);
	}
}
