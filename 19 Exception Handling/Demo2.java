// example showing the concept of exception handling

import java.util.Scanner;
class Demo2{
    void divide(int a,int b){
            int c = a/b;
            System.out.println("Result : "+c);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Demo2 obj = new Demo2();

        try{        
            obj.divide(a,b);    
        }catch(Exception e){
           System.out.println("You are trying to divide a number by Zero");
           // e.printStackTrace(); 
        }
    }
}