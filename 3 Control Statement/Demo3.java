// example showing the concept of conditional control statement 

import java.util.Scanner;
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = sc.nextInt();

        if(a%2==0)
            System.out.println(a+" is even");
        else
            System.out.println(a+" is odd");
    }
}