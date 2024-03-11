package object;

public class Student {
	
	String name, college, branch, gender;
	int id;
	
	Student(){}

	public Student(String name, String college, String branch, String gender, int id) {
		this.name = name;
		this.college = college;
		this.branch = branch;
		this.gender = gender;
		this.id = id;
	}
	public void displayStudent()
	{
		System.out.println(branch);
		System.out.println(name);
		System.out.println(college);
		System.out.println(gender);
		System.out.println(id);
	}

	public String toString() {
		return "Student [name=" + name + ", college=" + college + ", branch=" + branch + ", gender=" + gender + ","
				+ " id=" + id + "]";
	}
	
	
	

}
