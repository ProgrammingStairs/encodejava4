
// this can also be passed as an argument in constructor call

class Student{
    Student(Demo11 obj){
        obj.display();
    }
}
class Demo11{
    void display(){
        System.out.println("display method called");
    }
    Demo11(){
        Student sobj = new Student(this);
    }
    public static void main(String args[]){
        new Demo11();
    }
}