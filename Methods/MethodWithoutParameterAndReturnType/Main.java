package Methods.MethodWithoutParameterAndReturnType;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int value = calc.cube();
        System.out.println("Cube : "+ value);
    }
}
