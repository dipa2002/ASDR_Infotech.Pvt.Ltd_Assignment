import java.util.Scanner;

public class OddNumber1to50 {
    public static void main(String[] args) {
        System.out.println("Odd numbers from 1 to 50:");

        // Loop to iterate through numbers from 1 to 50
        for (int i = 1; i <= 50; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

    }
}
