package MultiThreadingExample.UsingThreadClass;

public class MyThread extends Thread
{
    public void run()
    {
        for(int i = 1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" - Count: "+ i);
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
