package ExceptionHandling.ExceptionHandlingExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem stu = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("===================");
            System.out.println("1.Add Student:");
            System.out.println("2.Remove Student");
            System.out.println("3.Display Student");
            System.out.println("4.Exit");
            System.out.println("===================");
            System.out.println("Enter your choice: ");
            try{
                choice = scanner.nextInt();
                switch(choice){
                    case 1:
                        stu.addStudents();
                        break;
                    case 2:
                        stu.removeStudent();
                        break;
                    case 3:
                        stu.displayStudents();
                        break;
                    case 4:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid choice please select valid option");
                }
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input.Please enter the correct data");
                scanner.nextLine();
            }
        }while(choice != 4);
        scanner.close();
    }
}
