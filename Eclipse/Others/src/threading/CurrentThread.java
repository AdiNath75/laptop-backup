package threading;

public class CurrentThread extends Thread{
	public void run()  
    {    
        // print currently executing thread   
        System.out.println(Thread.currentThread().getName());    
    }    
    public static void main(String args[])  
    {    
        // creating two thread  
        CurrentThread t1=new CurrentThread();    
        CurrentThread t2=new CurrentThread();    
        // this will call the run() method  
        t1.start();    
        t2.start();    
    }    

}
