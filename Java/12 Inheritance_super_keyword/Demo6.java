// example showing the concept of hierarchical inheritance 

import java.util.Scanner;
class Person{
    String name;
    int age;
    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter name : ");
        name = sc.nextLine();
        System.out.println("Enter age : ");
        age = sc.nextInt();
    }
    void showDetails(){
        System.out.println("\nName : "+name);
        System.out.println("Age : "+age);
    }
}
class Student extends Person{
    String course;
    int fees;
    void getStudDetails(){
        getDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter course name : ");
        course = sc.nextLine();
        System.out.println("Enter fees : ");
        fees = sc.nextInt();
    }
    void showStudDetails(){
        showDetails();
        System.out.println("Course Name : "+course);
        System.out.println("Fees : "+fees);
    }
}
class Employee extends Person{
    String designation;
    int salary;
    void getEmpDetails(){
        getDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Designation : ");
        designation = sc.nextLine();
        System.out.println("Enter salary : ");
        salary = sc.nextInt();
    }
    void showEmpDetails(){
        showDetails();
        System.out.println("Designation : "+designation);
        System.out.println("Salary : "+salary);
    }
}
class Demo6{
    public static void main(String args[]){
        Employee eobj = new Employee();
        Student sobj = new Student();
            eobj.getEmpDetails();
            sobj.getStudDetails();
            eobj.showEmpDetails();
            sobj.showStudDetails();
    }
}