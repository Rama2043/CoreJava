package Assignments.RealTimeOOPSExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement techEmployee = new Tech();
        techEmployee.setName("Rama");
        techEmployee.setEmpID("Emp01");
        techEmployee.setDepartment("Tech");
        techEmployee.setPhoneNumber(958573618);
        techEmployee.displayEmployeeDetails();

    }
}
