package encapsulation;

public class Address {
	String house_name,street_name,city,state;
	int pin;
	
	Address(){}
	
	Address(String house_name,String street_name, String city, String state,int pin)
	{
		this.house_name = house_name;
		this.street_name = street_name;
		this.city = city;
		this.state = state;
		this.pin = pin;
		System.out.println("Address Created");
	}
	
	public void displayAddress()
	{
		System.out.println("House number: "+house_name);
		System.out.println("Street name: "+street_name);
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("Pincode: "+pin);
	}
	

}
