package OOPSExample.Inheritance.SingleInheritance;

public class Main {
    public static void main(String[] args) {
        //Ford inherits properties from car class
        Ford f = new Ford();
        f.setDetails();
        System.out.println("Name: "+f.name);
        System.out.println("Model: "+f.model);
        System.out.println("Year: "+f.year);

    }
}
