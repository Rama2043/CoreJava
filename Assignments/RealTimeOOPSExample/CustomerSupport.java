package Assignments.RealTimeOOPSExample;

import java.util.Objects;
import java.util.Scanner;

public class CustomerSupport extends EmployeeManagement{
    private long salary = 75000;

    Scanner scanner = new Scanner(System.in);

    public String designation(){
        System.out.println("Designation of the Tech Employee(Only mention manager or associate): ");
        String designation = scanner.nextLine();
        return designation;
    }
    public void calculateSalary(String str){
        if(Objects.equals(str, "manager")){
            System.out.println("The Salary of Manager "+getName()+" is: "+salary*4);
        }
        else{
            System.out.println("The Salary of Customer Associate "+getName()+" is: "+salary*2);
        }
    }

    public void displayEmployeeDetails(){
        String str = designation();
        super.displayEmployeeDetails();
        calculateSalary(str);
    }
}
