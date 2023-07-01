package collection;

public class Contacts {
	
	String name, loc, email;
	long phno;
	
	public Contacts() {
		// TODO Auto-generated constructor stub
	}

	public Contacts(String name, String loc, String email, long phno) {
		super();
		this.name = name;
		this.loc = loc;
		this.email = email;
		this.phno = phno;
	}
	
	public String toString()
	{
		return "( "+name+" ---> "+phno+" )";
		
	}

}
