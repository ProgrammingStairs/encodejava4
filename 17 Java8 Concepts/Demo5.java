// example showing the concept of method reference to an instance method

import java.util.Scanner; 
interface Showable{
    int calculate(int a,int b);
}
class Demo5{
    // instance method
    int sum(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();

        Showable obj;
        obj = new Demo5() :: sum;
        System.out.println("Sum : "+obj.calculate(a,b));

    }
}