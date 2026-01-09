// example showing the concept of constructor chaining 
// this must be first statement in constructor call
// this can also be used to call current class constructor

class Student{
    int rno;
    String name;
    double per;
    Student(){
        this(101);
        System.out.println("no argument constructor called");
    }
    Student(int rno){
        this(rno,"Andrew Anderson");
    }
    Student(int rno,String name){
        this(rno,name,78.56);
    }
    Student(int rno,String name,double per){
        this.rno=rno;
        this.name=name;
        this.per=per;
        display();
    }
    void display(){
        System.out.println("Roll Number : "+rno);
        System.out.println("Name : "+name);
        System.out.println("Percentage : "+per);
    }
}
class Demo10{
    public static void main(String args[]){
        new Student();
    }
}