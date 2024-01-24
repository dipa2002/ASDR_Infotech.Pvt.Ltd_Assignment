import java.util.Scanner;
public class NumberSpelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Spell out the number
        String spelledNumber = spellNumber(number);

        // Display the result
        System.out.println("Spelled Number: " + spelledNumber);

        // Close the scanner
        scanner.close();
    }

    static String spellNumber(int number) {
        // Arrays for words
        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        // Spell out the number
        if (number == 0) {
            return "zero";
        } else if (number >= 1 && number <= 9) {
            return units[number];
        } else if (number >= 11 && number <= 19) {
            return teens[number - 10];
        } else if (number >= 21 && number <= 99) {
            return tens[number / 10] + ((number % 10 != 0) ? " " + units[number % 10] : "");
        } else {
            return "Number out of range";
        }
    }
}
