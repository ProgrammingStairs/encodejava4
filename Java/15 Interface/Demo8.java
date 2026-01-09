// example showing the concept of interface 
interface Showable{
    void show();
}
interface Movable{
    void show();
}
class Demo8 implements Movable,Showable{
    @Override
    public void show(){
        System.out.println("show method called");
    }
    public static void main(String args[]){
       Movable obj1 = new Demo8();
       Showable obj2 = new Demo8();
       
       obj1.show();
       obj2.show();
    }
}