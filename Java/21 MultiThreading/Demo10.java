// example showing the concept of threads
// InterThread Communication (Co-operation of Thread)

class Customer{
    int bal;
    Customer(int bal){
        this.bal=bal;
    }
    synchronized void withdraw(int wamt){
        if(wamt>bal){
            System.out.println("Low Balance");
            try{
                 wait();
            }catch(InterruptedException e){
                System.out.println("Exception : "+e);
            }
        }   
        System.out.println("Going to Withdraw");
        System.out.println("Balance : "+bal);
        System.out.println("Withdraw Amount : "+wamt);
        System.out.println("Remaining Balance : "+(bal-wamt));
    }
    synchronized void deposit(int damt){
        System.out.println("Going to Deposit");
        this.bal=this.bal+damt;
        System.out.println("Deposit completed | Now you can withdraw");
            notify();
    }
}
class Demo10{
    public static void main(String args[]){
        Customer customer = new Customer(1000);    
        new Thread(){
            @Override
            public void run(){
                customer.withdraw(1500);
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                customer.deposit(5000);
            }
        }.start();
    }
}