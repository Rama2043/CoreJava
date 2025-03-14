package MultiThreadingExample.UsingRunnableInterface;

public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();

        Thread thread1 = new Thread(myRunnable1,"Thread-1");
        Thread thread2 = new Thread(myRunnable2,"Thread-2");

        thread1.start();
        thread2.start();
    }
}
