// example of this keyword
// this keyword can also be used to return current class instance(object)

import java.util.Scanner;
class Demo18{
    Demo18 show(){
        System.out.println("show method called");
        return this;
    }
    void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
       Demo18 obj = new Demo18();
       Demo18 res = obj.show(); 
       res.display(); 
    }
}