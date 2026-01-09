// example showing the concept of function
class Demo2{
    void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        /*
            new Demo2().display(); // anonymous object
            new Demo2().display(); // anonymous object
            new Demo2().display(); // anonymous object
            new Demo2().display(); // anonymous object
            new Demo2().display(); // anonymous object
        */
       Demo2 obj = new Demo2();
       obj.display();
       obj.display();
       obj.display();
       obj.display();
       obj.display();
    }
}