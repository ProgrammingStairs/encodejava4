// example showing the concept of function

class Demo1{
    void display1(){
        System.out.println("display1 method called");
    }
    public void display2(){
        System.out.println("display2 method called");
    }
    protected void display3(){
        System.out.println("display3 method called");
    }
    private void display4(){
        System.out.println("display4 method called");
    }

    public static void main(String args[]){
        Demo1 obj  = new Demo1();
        obj.display1();
        obj.display2();
        obj.display3();
        obj.display4();
    }
}