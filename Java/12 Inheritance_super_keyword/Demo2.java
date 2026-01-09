// example showing the concept of super keyword
/*
    super keyword : 
        a. variable
        b. method
        c. constructor
*/

class Parent{
   String name = "Peter";
   void show(){
    System.out.println("show method of parent called");
   } 
}
class Child extends Parent{
   String name = "Andrew";
   void show(){
    System.out.println("show method of child called");
   } 
    void display(){
        System.out.println("name of child : "+name);
        System.out.println("name of parent : "+super.name);
        show();
        super.show();
    }
}
class Demo2{
    public static void main(String args[]){
        Child cobj = new Child();
        cobj.display();
    }
}