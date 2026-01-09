// example showing the concept of exception handling

// creating custom exception through checked exception
class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}
class Demo11{
    // public void myMethod() throws MyException{
    //     System.out.println("myMethod caled..!!");
    //     throw new MyException("custom exception thow example");
    // }
    public void myMethod(){
        System.out.println("myMethod caled..!!");
        try{
            throw new MyException("custom exception thow example");
        }catch(MyException e)
        {
            System.out.println("Exception : "+e.getMessage());
        }
    }

    public static void main(String args[]){
        Demo11 obj = new Demo11();
            obj.myMethod();
    }
}