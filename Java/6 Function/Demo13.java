// example 
import java.util.Scanner;
class Demo13{
    int a,b; // instance variable
    public static void main(String args[]){
       Demo13 obj1 = new Demo13();
       System.out.println("obj1 a : "+obj1.a); 
       System.out.println("obj1 b : "+obj1.b); 
       obj1.a = 100;
       obj1.b = 200; 
       System.out.println("\nobj1 a : "+obj1.a); 
       System.out.println("obj1 b : "+obj1.b); 
       
       Demo13 obj2 = new Demo13();
       System.out.println("\nobj2 a : "+obj2.a); 
       System.out.println("obj2 b : "+obj2.b); 
    }
}