package Assignments.BankingManagementSystem.ExceptionHandling;

public class Account {
    private String Name;
    private String accNumber;
    private double balance = 0;
    private int age;
    private String phoneNumber;


    public String getName() {
        return Name;
    }

    public String getAccNumber() {
        return accNumber;
    }
    public double getBalance(){
        return balance;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Account(String Name,int age,String phoneNumber,double balance){
        this.Name = Name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }
}
