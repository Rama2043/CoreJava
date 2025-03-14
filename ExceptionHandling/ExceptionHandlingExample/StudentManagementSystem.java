package ExceptionHandling.ExceptionHandlingExample;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManagementSystem {
    private ArrayList<Student> students;
    private Scanner scanner;

    public StudentManagementSystem(){
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    public void addStudents(){
        try{
            System.out.println("Enter Student Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Student ID:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Student Grade:");
            int grade = scanner.nextInt();

            students.add(new Student(id,name,grade));
            System.out.println(students.get(0));
            System.out.println("Student added successfully");

        }
        catch(InputMismatchException e){
            System.out.println("Invalid input.Please enter the correct data");
            scanner.nextLine();
        }
    }

    public void displayStudents(){
        if(students.isEmpty()){
            System.out.println("No student data to display");
        }
        else{
            System.out.println("Student Records: ");
            for(Student student:students ){
                student.displayStudentDetails();
            }
        }
    }

    public void removeStudent(){
        try{
            System.out.println("Enter the student ID to remove: ");
            int id = scanner.nextInt();
            boolean removed = false;
            for(Student student:students){
                if(student.getId()==id){
                    students.remove(student);
                    System.out.println("Student removed successfully");
                    removed = true;
                    break;
                }
            }
            if(!removed){
                System.out.println("Student with ID "+id+" not found");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input.Please enter the correct data");
            scanner.nextLine();
        }
    }
}
