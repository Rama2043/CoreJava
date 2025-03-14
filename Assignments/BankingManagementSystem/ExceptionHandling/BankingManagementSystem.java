package Assignments.BankingManagementSystem.ExceptionHandling;

import java.util.*;

public class BankingManagementSystem {
    private final Scanner scanner;
    private final HashMap<String, Account> bankDetails;
    private LinkedList<Integer> numberOfAccounts;



    public BankingManagementSystem(){

        scanner = new Scanner(System.in);
        bankDetails = new HashMap<>();
    }
    public void createAccount(){
        try{
            System.out.println("Enter your Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty.Please");
            }
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            try {
                if (age < 18) {
                    throw new IllegalArgumentException("Age must be 18 or older");
                }
            }
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                System.exit(0);
            }
            scanner.nextLine();
            System.out.println("Enter your Phone Number: ");
            String phoneNumber = scanner.nextLine();
            double balance = deposit();
            String accNumber = generateAccountNumber();
            bankDetails.put(accNumber,new Account(name,age,phoneNumber,balance));
            System.out.println("Account created successfully.");
        }
        catch(InputMismatchException i){
            System.out.println("Invalid input.Please enter the correct data");
            scanner.nextLine();
        }
    }

    public void withdraw(){
        try{
            System.out.println("Enter your Account Number: ");
            String accNumber = scanner.nextLine();
            if(!bankDetails.containsKey(accNumber)){
                System.out.println("There is no account with the specified Account Number." +
                        "Please create an account");
            }
            else{
                Account acc = bankDetails.get(accNumber);
                System.out.println("Enter the amount to withdraw: ");
                double withdraw = scanner.nextDouble();
                scanner.nextLine();
                double balance = acc.getBalance();
                if(withdraw> balance){
                    throw new IllegalArgumentException("Insufficient balance");
                }
                else{
                    System.out.println("Amount "+ withdraw + " withdrawn successfully");
                    balance = balance - withdraw;
                    acc.setBalance(balance);
                }
            }

        }
        catch(InputMismatchException e){
            System.out.println("Invalid data. Please enter the correct data");
        }
    }
    public double deposit(){
        System.out.println("Enter your Account Number: ");
        String accNumber = scanner.nextLine();
        double balance = 0;
        if(!bankDetails.containsKey(accNumber)){
            System.out.println("There is no account with the specified Account Number." +
                    "Please create an account");
        }
        else{
            Account acc = bankDetails.get(accNumber);
            System.out.println("Enter money to deposit in account: ");
            double deposit = scanner.nextDouble();
            scanner.nextLine();
            balance = acc.getBalance();
            balance += deposit;
            acc.setBalance(balance);
            System.out.println("Amount "+deposit+" deposited successfully");

        }
        return balance;
    }
    public void checkBalance(){
        System.out.println("Enter your Account Number: ");
        String accNumber = scanner.nextLine();
        if(!bankDetails.containsKey(accNumber)){
            System.out.println("There is no account with the specified Account Number." +
                    "Please create an account");
        }
        else{
            Account acc = bankDetails.get(accNumber);
            double balance = acc.getBalance();
            System.out.println("Balance: "+balance);
        }
    }
    public void displayAccDetails(){
        System.out.println("Enter your Account Number: ");
        String accNumber = scanner.nextLine();
        if(!bankDetails.containsKey(accNumber)){
            System.out.println("There is no account with the specified Account Number." +
                    "Please create an account");
        }
        else{
            Account acc = bankDetails.get(accNumber);
            System.out.println("Name: "+acc.getName());
            System.out.println("Age: "+acc.getAge());
            System.out.println("Phone Number: "+acc.getPhoneNumber());
            System.out.println("Remaining balance: "+acc.getBalance());
        }
    }

    public String generateAccountNumber(){
        if(numberOfAccounts.isEmpty()){
            numberOfAccounts.add(1);
            return "Acc" + numberOfAccounts.getLast().toString();
        }
        return "Acc" + (numberOfAccounts.getLast() + 1);
    }

}
