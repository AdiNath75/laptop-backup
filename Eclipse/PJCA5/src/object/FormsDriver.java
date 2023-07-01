package object;

public class FormsDriver {
	
		public static void main(String[] args) 
		{
			Forms f1 = new Forms("Adi",7558281979l,"adi@gmail.com","03/01/98",true,"Male");

			f1.displayForms();

			Forms f2 = new Forms("Nath",7020550225l,"nath@gmail.com","Pune","01/01/2000",true,"Male");
			
			f2.displayForms();
			
			Forms f3 = new Forms("ASD", 9856741025l, "PUNE", "asd@gmail.com","1/2/1998", 741236985l, false, "A+", "Male");
			
			f3.displayForms();
		}
	
}
