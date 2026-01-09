// example showing the concept of function
// with argument with return type

import java.util.Scanner;
class Demo8{
    int addition(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
       Demo8 obj = new Demo8();
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
      
        System.out.println("sum : "+obj.addition(a,b));
    }
}