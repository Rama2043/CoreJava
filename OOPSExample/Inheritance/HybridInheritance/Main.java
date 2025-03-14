package OOPSExample.Inheritance.HybridInheritance;

import OOPSExample.Inheritance.HierarchicalInheritance.Toyota;

public class Main {
    public static void main(String[] args) {
        //Implementation of Hybrid Inheritance
        // Ford inherits Car. Car inherits Transport.Thus, MultiLevel Inheritance.
        //Toyota inherits Car. Ford inherits Car.Thus, Hierarchical Inheritance
        Ford f1 = new Ford();
        Toyota t1 = new Toyota();
        f1.setDetails();
        t1.setDetails();
        System.out.println("Mode of Transport: "+f1.mode);
        System.out.println("Type of Vehicle: "+f1.type);
        System.out.println("Name: "+f1.name);
        System.out.println("Model: "+f1.model);
        System.out.println("Year: "+f1.year);
        System.out.println("==============================");
        System.out.println("Name: "+t1.name);
        System.out.println("Model: "+t1.model);
        System.out.println("Year: "+t1.year);


    }
}
