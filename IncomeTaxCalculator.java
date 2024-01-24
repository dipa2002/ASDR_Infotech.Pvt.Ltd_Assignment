import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the income amount: ");
        double income = scanner.nextDouble();
        double incomeTax = 0;

        if (income <= 50000) {
            // No income tax for the first slab
            incomeTax = 0;
        } else if (income <= 60000) {
            // 10% on the additional amount for the second slab
            incomeTax = 0.10 * (income - 50000);

        } else if (income <= 150000) {
            // 10% on the additional amount up to 60,000
            incomeTax = 0.10 * (60000 - 50000) + 0.20 * (income - 60000);
        } else {
            // 10% on the additional amount up to 60,000
            // 20% on the additional amount up to 1,50,000
            incomeTax = 0.10 * (60000 - 50000) + 0.20 * (150000 - 60000) + 0.30 * (income - 150000);
        }

        System.out.println("Income Tax to be paid: Rs. " + incomeTax);
    }
}
