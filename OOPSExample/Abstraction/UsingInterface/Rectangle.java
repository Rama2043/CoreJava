package OOPSExample.Abstraction.UsingInterface;

public class Rectangle implements Shape{
    public int length;
    public int breadth;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void draw(){
        System.out.println("A Rectangle of length " + length + " and breadth " + breadth + " is drawn");
    }
}
