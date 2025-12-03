// example showing the concept of interface 

interface Showable{
    default void display(){
        System.out.println("display method called");
    }
    static void show(){
        System.out.println("show method called");
    }
}
class Demo10 implements Showable{
    public static void main(String args[]){
        Showable obj = new Demo10();
        obj.display();
        Showable.show();
    }
}