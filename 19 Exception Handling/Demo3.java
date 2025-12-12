// example showing the concept of exception handling

import java.util.Scanner;
class Demo3{
    void divide(int a,int b){
        try{
            int c = a/b;
            System.out.println("Result : "+c);
        }catch(Exception e){
           //System.out.println("You are trying to divide a number by Zero");
            e.printStackTrace(); 
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Demo3 obj = new Demo3();
            obj.divide(a,b); 
    }
}