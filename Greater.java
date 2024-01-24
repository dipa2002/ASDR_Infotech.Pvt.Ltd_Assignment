import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter First number");
        a=sc.nextInt();
        System.out.println("Enter Second number");
        b=sc.nextInt();
        System.out.println("Enter third number");
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println(+a+" is greater number");
        } else if (b>a && b>c)
        {
            System.out.println(+b+ " is greater number");
        }
        else {
            System.out.println(+c+ " is greater number");
        }
    }
}
