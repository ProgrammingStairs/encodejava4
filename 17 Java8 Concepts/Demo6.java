// example showing the concept of method reference to an static method

import java.util.Scanner; 
interface Showable{
    int calculate(int a,int b);
}
class Demo6{
    // static method
    static int sum(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();

        Showable obj;
        obj = Demo6 :: sum;
        System.out.println("Sum : "+obj.calculate(a,b));

    }
}