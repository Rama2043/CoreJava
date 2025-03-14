package OOPSExample.Inheritance.HierarchicalInheritance;

public class Main {
    public static void main(String[] args) {
        //Implementation of Hierarchical Inheritance
        //Ford inherits properties from car class
        //Toyota also inherits properties from Car class.
        Ford f = new Ford();
        Toyota t = new Toyota();
        f.setDetails();
        t.setDetails();
        System.out.println("Name: "+f.name);
        System.out.println("Model: "+f.model);
        System.out.println("Year: "+f.year);
        System.out.println("====================");
        System.out.println("Name: "+t.name);
        System.out.println("Model: "+t.model);
        System.out.println("Year: "+t.year);

    }
}
