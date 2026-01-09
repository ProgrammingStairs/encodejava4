// example showing the concept of initializer block

class Demo12{
    {
        System.out.println("Initializer block called");
    }
    Demo12(){
        this("hello");
    }
    Demo12(String message){
        System.out.println("Message : "+message);
    }
    public static void main(String args[]){
        new Demo12();
    }
}