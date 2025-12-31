// example showing the concept of threads
// Deadlock
/*
    DeadLock : Deadlock is the situation, where no progress is going to be made, which means dead end.
               suppose we have 2 threads, thread 1 and thread 2, and thread 1 have resource r1 and thread 2 have resource r2, now the situation is thread 1 uses resource r1 and needs resource r2 and thread 2 uses resource r2 and needs resource r1, and this situation is never going to be satisfied, which results in dead lock.
*/
class Paper{}
class Pen{}
class Demo12{
    public static void main(String args[]){
        Paper pr = new Paper();
        Pen pn = new Pen();
        new Thread(){
            @Override
            public void run(){
                synchronized(pr){
                    System.out.println("Thread 1 uses paper and needs pen");
                    try{ 
                        Thread.sleep(1000);
                    }catch(InterruptedException e){ 
                        System.out.println("Exception : "+e);
                    }
                    synchronized(pn){
                        System.out.println("Thread 1 uses pen and needs paper");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                synchronized(pn){
                    System.out.println("Thread 2 uses pen and needs paper");
                    try{ 
                        Thread.sleep(1000);
                    }catch(InterruptedException e){ 
                        System.out.println("Exception : "+e);
                    }
                    synchronized(pr){
                        System.out.println("Thread 2 uses paper and needs pen");
                    }
                }
            }
        }.start();
    }
}