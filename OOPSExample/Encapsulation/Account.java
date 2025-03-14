package OOPSExample.Encapsulation;

public class Account {
    private String owner;
    private String acc_number;
    private long balance;

    /**
     * Declared instance variables cannot be accessed as it is private.
     */
    public void setDetails(String owner, String acc_number, long balance){
        this.owner = owner;
        this.acc_number = acc_number;
        this.balance = balance;
    }

    public void display(){
        System.out.println("Owner of the account: " + owner);
        System.out.println("Account Number: " + acc_number);
        System.out.println("Remaining balance: " + balance);
    }
}
