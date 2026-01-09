// example of this keyword
// this keyword can also be passed as an argument

import java.util.Scanner;
class Demo17{
    void show(Demo17 x){
         System.out.println("show method called");
         System.out.println("default string representation of object  : "+x);
    }
    void display(){
        System.out.println("display method called");
        show(this);
    }
    public static void main(String args[]){
       Demo17 obj = new Demo17();
       obj.display();
    }
}