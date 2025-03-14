package ExceptionHandling;

public class UsingThrow {
    public static void main(String[] args) {
        checkAge(17);
    }
    public static void checkAge(int age){
        if(age<18){
            throw new IllegalArgumentException("Age must be 18 or older");
        }
        else{
            System.out.println("You are allowed to proceed.");
        }
    }
}

