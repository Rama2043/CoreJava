package OOPSExample.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.setDetails("Rama","CNRB00001",256700000);
        //System.out.println(acc1.owner);//Cannot access as the instance variable owner is private
        //So the class Account is encapsulated.
        acc1.display();
    }
}
