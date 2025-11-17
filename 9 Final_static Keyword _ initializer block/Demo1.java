/*
    Final Keyword : 
        Final keyword can be use with : 
            a. variable : If we make any variable finel , then in that case we cannot change the value of that specific variable because after putting final keyword it is considered as constant.

            b. class : If we make any class as a final then in that case we cannot extends final class

            c. method : If we make any method as a final method, then in that case we cannot override that specific final method.
*/

class Demo1{
    final int a;
    Demo1(){
        a = 100;
    }
    public static void main(String args[]){
        Demo1 obj = new Demo1();
        System.out.println("value of a : "+obj.a);
    }
}