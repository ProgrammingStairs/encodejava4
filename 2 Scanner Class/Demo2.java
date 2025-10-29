// program to take values from user
import java.util.Scanner;
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base : ");
        int b = sc.nextInt();

        System.out.println("Enter exponent : ");
        int e = sc.nextInt();

        System.out.println("Result : "+Math.pow(b,e));
        int d1 = -45,d2=56;
        System.out.println("Result : "+Math.abs(d1));
        System.out.println("Result : "+Math.abs(d2));
        System.out.println("Result : "+Math.sqrt(b));
        System.out.println("Result : "+Math.cbrt(b));
    }
}




