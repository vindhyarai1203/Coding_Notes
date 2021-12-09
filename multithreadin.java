import java.lang.*;
import java.util.*;
// this will print sometimes hi and sometimes hello;
class mythread extends Thread
{
    public void run()
    {
        int i=1;
       
            while(true)
            {
                System.out.println("Hello");
                i++;
            }
            
      
        
    }
}
public class Main{
    
    public static void main(String[] args) {
        mythread t=new mythread();
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(" hi");
            i++;
        }
    }
}
