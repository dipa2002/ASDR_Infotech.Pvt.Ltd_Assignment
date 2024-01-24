import java.util.Scanner;

public class ProductPriceCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter product name: ");
        String productName = sc.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter discount percentage: ");
        double discountPercentage = sc.nextDouble();

        // Calculate original price based on product name
        double originalPrice;
        switch (productName) {
            case "redmi":
                originalPrice = 10000;


                break;
            case "realme":
                originalPrice = 8000;

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
