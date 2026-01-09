// example showing the concept of non static nested class
class EnclosingClass{
    void show(){
        NestedClass obj = new NestedClass();
        obj.display();

        class LocalClass{ // local class
            void show(){
                System.out.println("show method called");
            }
        }
        LocalClass obj1 = new LocalClass();
        obj1.show();
    }
    class NestedClass{ // member class
        void display(){
            System.out.println("display method called");
        }
    }
}
class Demo5{
    public static void main(String args[]){
        EnclosingClass obj = new EnclosingClass();
        obj.show();
    }
}