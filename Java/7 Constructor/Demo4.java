// example showing the concept of constructor
// parameterized constructor

import java.util.Scanner;
class Demo4{
    int rno;
    float per;
    String name;
    Demo4(){
        System.out.println("no argument constructor called");
    }
    Demo4(int rno,float per,String name){
        this.rno = rno;
        this.per = per;
        this.name = name; 
        System.out.println("parameterized constructor called");
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
        
        Demo4 obj = new Demo4(rno,per,name);
        obj.display();

        new Demo4();
    }
}