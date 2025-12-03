// example showing the concept of interface 

interface Showable{
    void show();
    void display();
}
class Demo4 implements Showable{
    @Override
    public void show(){
        System.out.println("show method called");
    }
    @Override
    public void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
       Showable obj = new Demo4();
       obj.show();
       obj.display();
    }
}