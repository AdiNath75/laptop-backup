package threading;

public class SleepEx1 extends Thread{
	public void run()  
    {    
        for(int i=1;i<5;i++)  
        {    
            try  
            {  
                Thread.sleep(1000);  
            }catch(InterruptedException e){System.out.println(e);}    
        System.out.println(i);    
        }    
    }   
	public static void main(String args[])  
    {    
        SleepEx1 t1=new SleepEx1();    
        SleepEx1 t2=new SleepEx1();    
        t1.start();    
        t2.start();    
    }    

}
