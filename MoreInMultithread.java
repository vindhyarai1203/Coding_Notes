import java.lang.*;
class Mythread extends Thread
{
    public Mythread(String name)
    {
        super(name);
        
    }
    public void run()
    {
        int count=1;
        while(true)
        {
           System.out.println(count++);
           try {
               Thread.sleep(1000);
               
           } catch(InterruptedException e) {
               System.out.println(e);
           }
        }
        
    }
}

public class Main
{
	public static void main(String[] args) {
	    Mythread t= new Mythread("Vindhya");
	    System.out.println(t.getId());
	    System.out.println(t.getName());
	    System.out.println(t.getState());
	    System.out.println(t.isAlive());
	    System.out.println(t.getPriority());
	    t.start();
	     System.out.println(t.getId());
	    System.out.println(t.getName());
	    System.out.println(t.getState());
	    System.out.println(t.isAlive());
	    System.out.println(t.getPriority());
		
	}
}
