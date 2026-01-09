// example showing the concept of non static nested class

class EnclosingClass{
    static int a = 100;
    private int b = 200;
    class NestedClass{
        void display(){
            System.out.println("display method called");
            System.out.println("a : "+a);
            System.out.println("b : "+b);
        }
    }
}
class Demo4{
    public static void main(String args[]){
        EnclosingClass.NestedClass obj = new EnclosingClass().new NestedClass();
        obj.display();
    }
}