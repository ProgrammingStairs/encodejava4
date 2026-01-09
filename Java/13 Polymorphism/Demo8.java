// example showing the concept of run time polymorphism
class Parent{
    String name="Andrew Anderson";
    void display(){
        System.out.println("display method of parent called");
    }
    void show(){
        System.out.println("show method of parent called");
    }
}
class Child extends Parent{
    String name="Peter Parker";
    void display(){
        System.out.println("display method of child called");
    }
    void draw(){
        System.out.println("draw method of child called");
        System.out.println("child name : "+name);
        System.out.println("parent name : "+super.name);
    }
}

class Demo8{
    public static void main(String args[]){
       Parent pobj = new Child(); // upcasting
       pobj.display();
       pobj.show();
       Child cobj = (Child)pobj;// downcasting
       cobj.draw();
    }
}

