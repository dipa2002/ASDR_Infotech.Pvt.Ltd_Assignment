import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number of terms:");
        int n= sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" "+b);
        for(int i=1;i<=n;i++){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
