// example showing the concept of method reference to a constructor

import java.util.Scanner; 
interface Showable{
    void calculate(int a,int b);
}
class Demo7{
    // static method
    Demo7(int a,int b){
        System.out.println("Sum : "+(a+b));
    }
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
        Showable obj;
        obj = Demo7 :: new;
        obj.calculate(a,b);
    }
}