import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.print(sum);

            if (i < n) {
               System.out.print(", ");
            }
        }
    }
}
