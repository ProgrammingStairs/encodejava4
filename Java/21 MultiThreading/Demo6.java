// example showing the concept of threads

class Demo6{
    public static void main(String args[]){
        /*
        Runnable r = new Runnable(){
            @Override
            public void run(){
                System.out.println("run method executes..!! ");
            }
        };
        Thread obj = new Thread(r);
        obj.start();
        */

       /*
        Thread obj = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("run method executes..!! ");
            }
        });
        obj.start();
       */ 
      
       /*
        new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("run method executes..!! ");
            }
        }).start();
        */
       /*
       Thread obj = new Thread(){
            @Override
            public void run(){
                System.out.println("run method executes..!! ");
            }
       };
       obj.start();
       */
      /*
       new Thread(){
            @Override
            public void run(){
                System.out.println("run method executes..!! ");
            }
       }.start();
      */ 
        /*
        Runnable r = ()->System.out.println("run method executes..!! ");
        Thread obj = new Thread(r);
        obj.start();
        */
       /*
        Thread obj = new Thread(()->System.out.println("run method executes..!! "));
        obj.start();
        */
       
        (new Thread(()->System.out.println("run method executes..!! "))).start();
       
    }
}