// example showing the concept of method overriding
class Parent{
    void display(){
        System.out.println("display of parent called");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("display of child called");
    }
}
class Demo4{
    public static void main(String args[]){
        Child cobj = new Child();
        cobj.display();
    }
}

