// example showing the concept of method overriding
class Parent{
    void show(){
        System.out.println("Its shape");
    }
}
class Circle extends Parent{
    @Override
    void show(){
        System.out.println("Its circle shape");
    }
}
class Rectangle extends Parent{
    @Override
    void show(){
        System.out.println("Its rectangle shape");
    }
}
class Square extends Parent{}
class Demo5{
    public static void main(String args[]){
        Circle cobj = new Circle();
        Rectangle robj = new Rectangle();
        Square sobj = new Square();
            cobj.show();
            robj.show();
            sobj.show();
    }
}

