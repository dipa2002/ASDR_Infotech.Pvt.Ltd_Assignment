import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = scanner.nextDouble();

        System.out.print("Enter DA: ");
        double da = scanner.nextDouble();

        // Calculate total salary
        double totalSalary = basicSalary + hra + da;

        // Deduct tax (fixed amount of Rs. 1000)
        double tax = 1000;
        double finalSalary = totalSalary - tax;

        // Display employee details
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("Basic Salary: Rs. " + basicSalary);
        System.out.println("HRA: Rs. " + hra);
        System.out.println("DA: Rs. " + da);
        System.out.println("Total Salary: Rs. " + totalSalary);
        System.out.println("Tax Deducted: Rs. " + tax);
        System.out.println("Final Salary: Rs. " + finalSalary);
    }
}
