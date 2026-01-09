// example showing the concept of interface 

interface Showable{
    default void display(){
        System.out.println("display method called");
    }
}
interface Movable{
    static void display(){
        System.out.println("display method called");
    }
}
class Demo11 implements Showable,Movable{
    @Override
    public void display(){
        System.out.println("display method of Demo11 called");
    }
    public static void main(String args[]){
        Showable obj = new Demo11();
        obj.display();
    }
}