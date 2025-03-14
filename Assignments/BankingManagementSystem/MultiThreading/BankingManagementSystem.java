package Assignments.BankingManagementSystem.MultiThreading;
public class BankingManagementSystem {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        Thread thread1 = new Thread(() -> account.deposit(500));
        Thread thread2 = new Thread(() -> account.withdraw(200));
        Thread thread3 = new Thread(() -> account.checkBalance());
        Thread thread4 = new Thread(() -> account.deposit(300));
        Thread thread5 = new Thread(() -> account.withdraw(150));
        Thread thread6 = new Thread(() -> account.checkBalance());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
    }
}
