// program to take values from user
import java.util.Scanner;
class Demo1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();

        System.out.println("Enter value of b : ");
        int b = sc.nextInt();

        System.out.println("Enter value of c : ");
        int c = sc.nextInt();

        double avg = (a+b+c)/3.0;
        // System.out.println("Sum : "+a+b+c);
        System.out.println("Sum : "+(a+b+c));
        System.out.println("Average : "+avg);
        System.out.printf("Average : %.2f",avg);
    }
}