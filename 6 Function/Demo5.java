// example showing the concept of function
// no argument no return type

import java.util.Scanner;
class Demo5{
    void addition(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
       System.out.println("Addition : "+(a+b)); 
    }
    public static void main(String args[]){
       Demo5 obj = new Demo5();
       obj.addition();
    }
}