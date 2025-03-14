package OOPS.Abstraction.UsingInterface;

public class Main {
    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine();
        atm.insertCard();
        atm.enterPIN(69);
        atm.checkBalance();
        atm.withdrawCash(1000);
        atm.checkBalance();
    }
}
