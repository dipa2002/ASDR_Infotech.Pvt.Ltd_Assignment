import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sci_mark, Math_mark,Eng_mark,total,avg;
        System.out.println("Enter the student name:");
        String name= sc.next();
        System.out.println("Enter the Student Address:");
        String add= sc.next();
        System.out.println("Enter the Science Marks:");
        sci_mark =sc.nextInt();
        System.out.println("Enter the Maths Marks:");
        Math_mark =sc.nextInt();
        System.out.println("Enter the English Marks:");
        Eng_mark =sc.nextInt();
        total=sci_mark+Math_mark+Eng_mark;
        avg=total/3;
        System.out.println("Student Name:"+name+"\nStudent Address: "+add+"\nScience Marks:" +sci_mark+"\nMaths Marks:" +Math_mark+"\nEnglish Marks:" +Eng_mark);
        System.out.println("Total Marks :"+total);
        System.out.println("Average Marks :" +avg);
    }
}
