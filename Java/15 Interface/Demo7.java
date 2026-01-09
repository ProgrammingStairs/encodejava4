// example showing the concept of interface 
interface Showable{
    void show();
}
interface Movable extends Showable{
    void display();
}
class Demo7 implements Movable{
    @Override
    public void show(){
        System.out.println("show method called");
    }
    @Override
    public void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
       Movable obj = new Demo7();
       obj.show();
       obj.display();
    }
}