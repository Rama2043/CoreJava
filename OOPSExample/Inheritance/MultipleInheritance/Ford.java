package OOPSExample.Inheritance.MultipleInheritance;

public class Ford implements Transport, Car{
    //Multiple Inheritance
    //Ford inherits methods from both Transport and Car interfaces
    public void displayTransportDetails(){
        System.out.println("Mode of Transport: Roadways");
        System.out.println("Type of Vehicle: 4-wheeler");
    }
    public void displayCardetails() {
        System.out.println("Name: Ford");
        System.out.println("Model: Eco-sport");
        System.out.println("Year: 2015");
    }
}



