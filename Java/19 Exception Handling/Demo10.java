// example showing the concept of exception handling

// creating custom exception through runtime exception | unchecked exception
class MyException extends RuntimeException{
    MyException(String msg){
        super(msg);
    }
}
class Demo10{
    public void myMethod(){
        System.out.println("myMethod caled..!!");
        throw new MyException("custom exception thow example");
    }
    public static void main(String args[]){
        Demo10 obj = new Demo10();
        try{
            obj.myMethod();
        }catch(MyException e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}