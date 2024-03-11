package abstraction;

public abstract class Whatsapp2 extends Whatsapp1 {
	
	public void audioSender()
	{
		System.out.println("Audio Sent...!");
	}
	
	public void audioReceiver()
	{
		System.out.println("Audio Received");
	}
	
	public void status(String st)
	{
		System.out.println(st);
		System.out.println("Status updated");
	}
	
	

}
