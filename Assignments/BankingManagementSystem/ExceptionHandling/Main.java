package Assignments.BankingManagementSystem.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankingManagementSystem bank = new BankingManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("===================");
            System.out.println("1.Create Account:");
            System.out.println("2.Deposit Amount");
            System.out.println("3.Withdraw Amount");
            System.out.println("4.Check Balance");
            System.out.println("5.Display Account Details");
            System.out.println("6.Exit");
            System.out.println("===================");
            System.out.println("Enter your choice: ");
            try{
                choice = scanner.nextInt();
                switch(choice){
                    case 1:
                        bank.createAccount();
                        break;
                    case 2:
                        bank.deposit();
                        break;
                    case 3:
                        bank.withdraw();
                        break;
                    case 4:
                        bank.checkBalance();
                        break;
                    case 5:
                        bank.displayAccDetails();
                        break;
                    case 6:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid choice please select valid option");
                }
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input.Please enter the correct data");
                scanner.nextLine();
            }
        }while(choice != 6);
        scanner.close();
    }
}
