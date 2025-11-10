// example of this keyword
// this keyword is used to represent current class instance variable

import java.util.Scanner;
class Demo15{
    int a,b; // instance variable
    void setData(int a,int b){
        this.a = a;
        this.b = b;
    }
    void add(){
        System.out.println("add : "+(a+b));
    }
    void sub(){
        System.out.println("sub : "+(a-b));
    }
    void mul(){
        System.out.println("mul : "+(a*b));
    }
    void div(){
        System.out.println("div : "+(a/b));
    }
    void mod(){
        System.out.println("mod : "+(a%b));
    }

    public static void main(String args[]){
       Demo15 obj = new Demo15();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two numbers : ");
       int a = sc.nextInt();
       int b = sc.nextInt();
       obj.setData(a,b);
       obj.add(); 
       obj.sub(); 
       obj.mul(); 
       obj.div(); 
       obj.mod(); 
    }
}