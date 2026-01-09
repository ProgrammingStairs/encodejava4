// example showing the concept of interface 

@FunctionalInterface
interface Showable{
    void show();
}
class Demo5 implements Showable{
    @Override
    public void show(){
        System.out.println("show method called");
    }
    public static void main(String args[]){
       Showable obj = new Demo5();
       obj.show();
    }
}