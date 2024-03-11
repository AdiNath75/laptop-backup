package threading;

public class SleepEx2 extends Thread{
	 public void run()  
	    {    
	        for(int i=1;i<5;i++)  
	        {    
	            try  
	            {  
	                Thread.sleep(-500); // sleep time is negative  
	            }catch(InterruptedException e){System.out.println(e);}    
	            System.out.println(i);    
	        }    
	    }    
    public static void main(String args[])  
    {    
        SleepEx2 t1=new SleepEx2();    
        SleepEx2 t2=new SleepEx2();    
        t1.start();    
        t2.start();    
    }    
}  

