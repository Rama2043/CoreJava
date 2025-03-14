package OOPS.Abstraction.UsingInterface;

public class ATMMachine implements ATM {
    private int balance = 1000;
    public void insertCard(){
        System.out.println("Card Inserted");
    }
    public void enterPIN(int PIN){
        System.out.println("PIN entered: "+ PIN);
    }
    public void withdrawCash(double amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("You withdrew "+ amount);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public void checkBalance(){
        System.out.println("Your Current Balance is:" + balance);
    }
}
