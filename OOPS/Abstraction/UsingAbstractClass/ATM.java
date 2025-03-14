package OOPS.Abstraction.UsingAbstractClass;

abstract class ATM {
    abstract void insertCard();
    abstract void enterPIN(int PIN);
    abstract void withdrawCash(double amount);
    abstract void checkBalance();
}
