// example showing the concept of constructor

class Demo2{
    Demo2(){
        int rno = 123;
        float per = 67.78f;
        String name = "Andrew Anderson"; 
        System.out.println("no argument constructor called");
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
    }
}