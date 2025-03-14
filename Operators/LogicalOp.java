package Operators;


public class LogicalOp {
    public static void main(String[] args) {
        boolean x = true , y = false;
        System.out.println("Output:" + (x && y) + " (Logical AND)");
        System.out.println("Output:" + (x || y) + " (Logical OR)");
        System.out.println("Output:" + (!x) + " (Logical NOT)");
    }
}
