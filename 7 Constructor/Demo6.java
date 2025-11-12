// example showing the concept of constructor
// copying values of one object into another

import java.util.Scanner;
class Demo6{
    int rno;
    float per;
    String name;
    Demo6(Demo6 obj){
       this.rno = obj.rno;
       this.per = obj.per;
       this.name = obj.name;
    }
    Demo6(int rno,float per,String name){
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
        
        Demo6 obj = new Demo6(rno,per,name);
        obj.display();

        Demo6 objNew = new Demo6(obj);

        System.out.println("\nAfter copying : ");
        objNew.display();
    }
}