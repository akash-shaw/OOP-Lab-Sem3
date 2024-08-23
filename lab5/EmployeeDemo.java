import java.util.Scanner;

class Employee {
    private String employeeName;
    private String city;
    private double basicSalary;
    private double dearnessAllowance;
    private double houseRentAllowance;
    private double totalSalary;

    void getdata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter city: ");
        city = sc.nextLine();

        System.out.print("Enter basic salary: ");
        basicSalary = sc.nextDouble();

        System.out.print("Enter dearness allowance (DA%) as a percentage: ");
        dearnessAllowance = sc.nextDouble();

        System.out.print("Enter house rent allowance (HRA%) as a percentage: ");
        houseRentAllowance = sc.nextDouble();
    }

    void calculate() {
        totalSalary = basicSalary + (basicSalary * dearnessAllowance / 100) + (basicSalary * houseRentAllowance / 100);
    }

    void display() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("City: " + city);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Dearness Allowance (DA): " + dearnessAllowance + "%");
        System.out.println("House Rent Allowance (HRA): " + houseRentAllowance + "%");
        System.out.println("Total Salary: " + totalSalary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.getdata();
        emp.calculate();
        emp.display();
    }
}
