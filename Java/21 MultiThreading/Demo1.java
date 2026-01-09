// example showing the concept of threads

// class Demo1{
//     public static void main(String args[]){
//         System.out.println("Thread : "+Thread.currentThread());
//     }
// }

class Demo1{
    void display(){
        System.out.println("Thread : "+Thread.currentThread());
    }
    public static void main(String args[]){
        Demo1 obj = new Demo1();
        obj.display();
    }
}