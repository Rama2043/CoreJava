package ExceptionHandling.ExceptionHandlingExample;

public class Student {
    private int id;
    private String name;
    private int grade;

    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
    public void displayStudentDetails(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Grade: "+grade);
    }
}
