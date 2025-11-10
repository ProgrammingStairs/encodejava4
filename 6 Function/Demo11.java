// example

import java.util.Scanner;
class Demo11{
    void operation(int a,int b){
        System.out.println("add : "+(a+b));
        System.out.println("sub : "+(a-b));
        System.out.println("mul : "+(a*b));
        System.out.println("div : "+(a/b));
        System.out.println("mod : "+(a%b));
    }
    public static void main(String args[]){
       Demo11 obj = new Demo11();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two numbers : ");
       int a = sc.nextInt();
       int b = sc.nextInt();
       obj.operation(a,b); 
    }
}