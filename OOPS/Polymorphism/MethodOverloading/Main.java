package OOPS.Polymorphism.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        MathOperations operations = new MathOperations();
        System.out.println(operations.add(5,0));
        System.out.println(operations.add(4,5,6));
    }
}
