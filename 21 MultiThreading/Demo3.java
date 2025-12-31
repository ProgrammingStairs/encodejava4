// example showing the concept of threads

class Demo3 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread : "+Thread.currentThread()+" Id : "+Thread.currentThread().getId()+" isAlive : "+Thread.currentThread().isAlive()+" Priority : "+Thread.currentThread().getPriority()+" GetName : "+Thread.currentThread().getName());
    }
    public static void main(String args[]){
        Demo3 obj1 = new Demo3();
        Demo3 obj2 = new Demo3();
        Demo3 obj3 = new Demo3();
        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.NORM_PRIORITY);
        obj3.setPriority(Thread.MAX_PRIORITY);

        obj1.setName("Andrew");
        obj2.setName("Peter");
        obj3.setName("Parker");
        
        obj1.start();
        obj2.start();
        obj3.start();

        try{    
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println("Exception : "+e);
        }
        
        System.out.println("check obj1 alives or not : "+obj1.isAlive());
    }
}