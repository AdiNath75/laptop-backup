package object;

public class Student2 {
		String name, college, branch, gender;
		int id;
		
		Student2(){}

		public Student2(String name, String college, String branch, String gender, int id) {
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
		
		public boolean equals(Object o)
		{
			Student2 ip = (Student2)o;
			if(this.name==ip.name && this.college==ip.college && this.branch==ip.branch && this.gender==ip.gender
					&& this.id==ip.id)
			{
				return true;
			}
			return false;
		}
		public int hashCode()
		{
			int hc = 0;
			hc = hc + id;
			return hc;
		}
		
}

