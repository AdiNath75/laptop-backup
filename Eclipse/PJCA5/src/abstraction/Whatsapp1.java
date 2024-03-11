package abstraction;

public abstract class Whatsapp1 implements Whatsapp {
	
	public void messageSender(String ip)
	{
		System.out.println(ip);
		System.out.println("Message Sent...!");
	}
	
	public void messageReceiver(String ip)
	{
		System.out.println(ip);
		System.out.println("Message Received");
	}

}
