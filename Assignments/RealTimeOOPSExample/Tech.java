package Assignments.RealTimeOOPSExample;

import java.util.Objects;
import java.util.Scanner;

public class Tech extends EmployeeManagement{

    private long salary = 100000;
    Scanner scanner = new Scanner(System.in);

    public String designation(){
        System.out.println("Designation of the Tech Employee(Only mention junior or senior): ");
        String designation = scanner.nextLine();
        return designation;
    }
    public void calculateSalary(String str){
        if(Objects.equals(str, "junior")){
            System.out.println("The Salary of Junior developer "+getName()+" is: "+salary*2);
        }
        else{
            System.out.println("The Salary of Senior developer "+getName()+" is: "+salary*4);
        }
    }
    public void displayEmployeeDetails(){
        String str = designation();
        super.displayEmployeeDetails();
        calculateSalary(str);
    }
}
