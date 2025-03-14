package Methods.MethodWithParameterAndReturnType;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int value = calc.add(5,4);
        System.out.println("Result : "+value);
        calc.getDetail("Hello");
    }
}
