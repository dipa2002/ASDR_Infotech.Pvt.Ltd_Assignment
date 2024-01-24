import java.util.Scanner;
public class ProductPriceCalculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double d1,d2;
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        // Calculate original price based on product name
        double originalPrice;
        switch (productName.toLowerCase()) {
            case "redmi":
                originalPrice = 10000;
                d1 = (10.0 / 100.0) * originalPrice;
                System.out.println("Discount : " + d1);
                break;
            case "realme":
                originalPrice = 8000;
                d2 = (8.0 / 100.0) * originalPrice;
                System.out.println("Discount : " + d2);
                break;
            default:
                System.out.println("Invalid product name");
                return;
        }

        // Calculate total price
        double discountAmount = (discountPercentage / 100) * originalPrice;
        double totalPrice = originalPrice - discountAmount;
        totalPrice *= quantity;

        // Display results
        System.out.println("\nProduct Name: " + productName);
        System.out.println("Original Price: " + originalPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        System.out.println("Total Amount to be Paid: " + totalPrice);
    }
}