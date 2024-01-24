import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int flag=1;
        System.out.println("Enter a number");
        int num= sc.nextInt();

        for(int i=2;i<num;i++){
            if(num%i==0)
            {
             flag=0;
             break;
            }

        }
        if(flag==1){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
        }
}
