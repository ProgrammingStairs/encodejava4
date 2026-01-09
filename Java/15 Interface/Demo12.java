// example showing the concept of interface 

interface Showable{
    default void display(){
        System.out.println("display method called");
        printData();
    }
    default void show(){
        System.out.println("display method called");
        printData();
    }
    private void printData(){
        System.out.println("statement 1");
        System.out.println("statement 2");
        System.out.println("statement 3");
    }
}
class Demo12 implements Showable{
    public static void main(String args[]){
        Showable obj = new Demo12();
        obj.display();
        obj.show();
    }
}