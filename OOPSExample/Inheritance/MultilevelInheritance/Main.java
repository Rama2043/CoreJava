package OOPSExample.Inheritance.MultilevelInheritance;

public class Main {
    public static void main(String[] args) {
        // Ford inherits Car. Car inherits Transport.Thus, MultiLevel Inheritance.
        Ford f = new Ford();
        f.setDetails();
        System.out.println("Mode of Transport: "+f.mode);
        System.out.println("Type of Vehicle: "+f.type);
        System.out.println("Name: "+f.name);
        System.out.println("Model: "+f.model);
        System.out.println("Year: "+f.year);

    }
}
