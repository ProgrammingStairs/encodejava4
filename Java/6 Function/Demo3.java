// example showing the concept of function
class Demo3{
    void display(){
        System.out.println("display method called");
    }
    void show(){
        System.out.println("show method called");
    }
    void draw(){
        System.out.println("draw method called");
    }
    public static void main(String args[]){
       Demo3 obj = new Demo3();
       obj.display();
       obj.draw();
       obj.show();
    }
}