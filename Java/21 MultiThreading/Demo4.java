// example showing the concept of threads

class Demo4 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("i : "+i);
        try{    
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println("Exception : "+e);
        }
        }
    }
    public static void main(String args[]){
        Demo4 obj1 = new Demo4();
        Demo4 obj2 = new Demo4();
        obj1.start();
        try{    
            // obj1.join();
                obj1.join(5000);
        }catch(InterruptedException e){
            System.out.println("Exception : "+e);
        }
        obj2.start();       
        }
}