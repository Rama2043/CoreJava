package Assignments.RealTimeOOPSExample;

public class EmployeeManagement implements Employee{

    private String name;
    private String empID;
    private long phoneNumber;
    private String department;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayEmployeeDetails() {
        System.out.println("Name of the Employee: "+name);
        System.out.println("ID of the Employee: "+empID);
        System.out.println("Mobile Number of the Employee: "+phoneNumber);
        System.out.println("Department of the Employee: "+department);
    }
}
