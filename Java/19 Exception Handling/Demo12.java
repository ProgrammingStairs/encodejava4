// example showing the concept of exception handling

import java.util.Scanner;
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
class Bank{
    int bal;
    Bank(int bal){
        this.bal=bal;
    }
    void withdrawal() throws  InsufficientBalanceException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdrawal amount : ");
        int wamt = sc.nextInt();
        if(wamt>this.bal)
            throw new InsufficientBalanceException("Low Balance");
        else{
            System.out.println("Balance : "+this.bal);
            System.out.println("Withdrawal Amount : "+wamt);
            System.out.println("Remaining Balance : "+(this.bal-wamt));
        }
    }
}
class Demo12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance : ");
        int bal = sc.nextInt();

        Bank bank = new Bank(bal); 
        try{
            bank.withdrawal();
        }catch(InsufficientBalanceException e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}