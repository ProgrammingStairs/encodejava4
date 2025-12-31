// example showing the concept of threads
// Thread synchronization | Static Synchronization

class First{
    // shared resource
    synchronized static void display(String name){
        System.out.print(" [ ");
            try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}
        System.out.print(name);
            try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}
        System.out.println(" ] ");
    }
}
class Second extends Thread{ 
    String name;
    Second(String name){
        this.name = name;
        start();
    }
    @Override
    public void run(){
            First.display(name);
    }
}
class Demo9{
    public static void main(String args[]){
        Second s1 = new Second("Andrew");
        Second s2 = new Second("Peter");
        Second s3 = new Second("Parker");
    }
}