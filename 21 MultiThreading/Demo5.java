// example showing the concept of threads

class Demo5 implements Runnable{
    @Override
    public void run(){
        System.out.println("run method executes..!! "+Thread.currentThread());
    }
    public static void main(String args[]){
        Demo5 obj1 = new Demo5();
        Thread th = new Thread(obj1);
        th.start();
    }
}