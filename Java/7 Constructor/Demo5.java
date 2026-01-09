// example showing the concept of constructor
// copying values of one object into another

import java.util.Scanner;
class Demo5{
    int rno;
    float per;
    String name;
    Demo5(){
        System.out.println("no argument constructor called");
    }
    Demo5(int rno,float per,String name){
        this.rno = rno;
        this.per = per;
        this.name = name; 
        System.out.println("\nparameterized constructor called\n");
    }
    void display(){
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number : ");
        int rno = sc.nextInt();
        System.out.println("Enter percentage : ");
        float per = sc.nextFloat();
        sc.nextLine();    
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        
        Demo5 obj = new Demo5(rno,per,name);
        obj.display();

        Demo5 objNew = new Demo5();
        objNew.rno = obj.rno;
        objNew.per = obj.per;
        objNew.name = obj.name;

        System.out.println("\nAfter copying : ");
        objNew.display();
    }
}