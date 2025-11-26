// example showing the concept of super keyword
class Parent{
    Parent(){
        System.out.println("Parent constructor called");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("Child constructor called");
    }
}
class Demo3{
    public static void main(String args[]){
        new Child();
    }
}