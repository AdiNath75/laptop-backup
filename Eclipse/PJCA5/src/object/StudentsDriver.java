package object;

public class StudentsDriver {

		public static void main(String[] args) 
		{
			Students s1 = new Students();
		
			 s1.detailStudent("Adi", 75 , "EEP").displayStudent();

			System.out.println(s1);

			Students s2 = new Students();

			s2.detailStudent("Nath", 44 ,"E&TC").displayStudent();

			System.out.println(s2);

			Students s3 = new Students();

			s3.detailStudent("Abc", 45, "CS").displayStudent();

			System.out.println(s3);
		}
}
