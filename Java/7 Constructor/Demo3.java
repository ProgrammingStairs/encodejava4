// example showing the concept of constructor

class Demo3{
    int rno;
    float per;
    String name;
    Demo3(){
        rno = 123;
        per = 67.78f;
        name = "Andrew Anderson"; 
        System.out.println("no argument constructor called");
    }
    void display(){
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
        Demo3 obj = new Demo3();
        obj.display();
    }
}