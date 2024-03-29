import java.util.Scanner;

public class Print_Spelling {
    static void printValue(char digit)
    {
        switch (digit)
        {
            case '0':
                System.out.print("Zero ");
                break;

            case '1':
                System.out.print("One ");
                break;

            case '2':
                System.out.print("Two ");
                break;

            case '3':
                System.out.print("Three ");
                break;

            case '4':
                System.out.print("Four ");
                break;

            case '5':
                System.out.print("Five ");
                break;

            case '6':
                System.out.print("Six ");
                break;

            case '7':
                System.out.print("Seven ");
                break;

            case '8':
                System.out.print("Eight ");
                break;

            case '9':
                System.out.print("Nine ");
                break;
        }
    }

    static void printWord(String N)
    {
        int i, length = N.length();

        // Finding each digit of the number
        for (i = 0; i < length; i++)
        {
            // Print the digit in words
            printValue(N.charAt(i));
        }
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        String N= sc.next();
        printWord(N);
    }
}
