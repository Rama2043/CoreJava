package Constructors.ParameterizedConstructor;

public class Car {
    String color;
    String Model;
    int Year;

    Car(String color, String model, int year){
        this.color = color;
        this.Model = model;
        this.Year = year;
    }

    void displayDetails(){
        System.out.println("Color : "+color);
        System.out.println("Model : "+Model);
        System.out.println("Year : "+Year);
    }
}
