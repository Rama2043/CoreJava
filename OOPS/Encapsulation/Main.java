package OOPS.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student student =  new Student();
        student.setName("Rama");
        student.setAge(-1);
        System.out.println("Student: "+student.getName());
        System.out.println("Age: "+ student.getAge());
    }
}
