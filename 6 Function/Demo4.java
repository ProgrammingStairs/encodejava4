// example showing the concept of function
class Demo4{
    void display(){
        System.out.println("display method called");
        show();
    }
    void show(){
        System.out.println("show method called");
        draw();
    }
    void draw(){
        System.out.println("draw method called");
    }
    public static void main(String args[]){
       Demo4 obj = new Demo4();
       obj.display();
    }
}