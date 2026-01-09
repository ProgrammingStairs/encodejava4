// example showing the concept of function
// with argument no return type

import java.util.Scanner;
class Demo7{
    void addition(int a,int b){
        System.out.println("sum : "+(a+b));
    }
    public static void main(String args[]){
       Demo7 obj = new Demo7();
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
      
       obj.addition(a,b);
    }
}