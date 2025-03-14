package OOPSExample.Abstraction.UsingAbstractClass;

public class Circle extends Shape{
    public double radius;
    Circle() {
        radius = 7;
    }

    public void draw(){
        System.out.println("The circle with radius "+ radius + " is drawn");
    }
}
