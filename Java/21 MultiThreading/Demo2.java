// example showing the concept of threads

class Demo2 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread : "+Thread.currentThread());
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        obj.start();
    }
}