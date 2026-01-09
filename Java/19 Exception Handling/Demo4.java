 // example showing the concept of exception handling

import java.util.Scanner;
class Demo4{
    void divide(int a,int b){
        try{
            int c = a/b;
                if(c>=5)
                    throw new ArithmeticException("Result greater than or equals to 5");
            System.out.println("Result : "+c);
        }catch(ArithmeticException e){
           System.out.println("Exception : "+e.getMessage());
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Demo4 obj = new Demo4();
            obj.divide(a,b); 
    }
}