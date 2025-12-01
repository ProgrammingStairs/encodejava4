// example showing the concept of run time polymorphism
class Parent{
    void display(){
        System.out.println("display method of parent called");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("display method of child called");
    }
}

class Demo7{
    public static void main(String args[]){
       Parent pobj = new Child(); // upcasting
       pobj.display();
    }
}

