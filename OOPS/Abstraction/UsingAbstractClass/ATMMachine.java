package OOPS.Abstraction.UsingAbstractClass;

public class ATMMachine extends ATM{
    private int balance = 1000;
    void insertCard(){
        System.out.println("Card Inserted");
    }
    void enterPIN(int PIN){
        System.out.println("PIN entered: "+ PIN);
    }
    void withdrawCash(double amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("You withdrew "+ amount);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    void checkBalance(){
        System.out.println("Your Current Balance is:" + balance);
    }
}
