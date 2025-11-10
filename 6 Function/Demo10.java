// example showing the concept of call by reference

import java.util.Scanner;
class Demo10{
    int a,b; // instance variable
    void swap(Demo10 x){
        int temp=x.a;
        x.a=x.b;
        x.b=temp;
        System.out.println("After swapping in swap : \na : "+x.a+"\nb : "+x.b);
    }
    public static void main(String args[]){
       Demo10 obj = new Demo10();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two numbers : ");
       int a = sc.nextInt();
       int b = sc.nextInt();
       obj.a = a;
       obj.b = b;
       System.out.println("Before swapping : \na : "+obj.a+"\nb : "+obj.b);
        obj.swap(obj);
       System.out.println("After swapping in main : \na : "+obj.a+"\nb : "+obj.b);
    }
}