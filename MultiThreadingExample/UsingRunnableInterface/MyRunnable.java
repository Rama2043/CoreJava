package MultiThreadingExample.UsingRunnableInterface;

public class MyRunnable implements Runnable{
    public void run(){
        for(int i = 1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" - Count: "+ i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
