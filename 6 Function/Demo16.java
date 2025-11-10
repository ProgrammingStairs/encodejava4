// example of this keyword
// this keyword is used to represent current class instance method

import java.util.Scanner;
class Demo16{
    int a,b; // instance variable
    void setData(int a,int b){
        this.a = a;
        this.b = b;
       this.add(); 
       sub(); // this.sub(); 
       this.mul(); 
       div(); // this.div(); 
       this.mod(); 
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
       Demo16 obj = new Demo16();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two numbers : ");
       int a = sc.nextInt();
       int b = sc.nextInt();
       obj.setData(a,b);
    }
}