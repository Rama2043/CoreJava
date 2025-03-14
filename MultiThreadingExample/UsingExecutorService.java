package MultiThreadingExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingExecutorService {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> {
            for(int i = 1;i<=5;i++){
                System.out.println("Task1: "+i);
            }
        };

        Runnable task2 = () -> {
            for(int i = 1; i<=5 ;i++){
                System.out.println("Task2: "+i);
            }
        };

        executor.execute(task1);
        executor.execute(task2);

        executor.shutdown();
    }
}
