package Constructors.DefaultConstructor;

public class Car {
    String color;
    String Model;
    int Year;

    Car(){
        color = "Red";
        Model = "Ford";
        Year = 2020;
    }
    void displayDetails(){
        System.out.println("Color : "+color);
        System.out.println("Model : "+Model);
        System.out.println("Year : "+Year);
    }
}
