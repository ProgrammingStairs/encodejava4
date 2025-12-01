// example showing the concept of abstract class 

abstract class RBI{
    RBI(){
        System.out.println("#### Welcome to Bank ####");
    }
    abstract double rate(); // abstract method 
    double finalSum(int bal,double rate){ // concrete method
        return bal + bal * rate/100;
    }
} 
class BOI extends RBI{
    @Override 
    double rate(){
        return 1.23;
    }
}
class SBI extends RBI{
    @Override 
    double rate(){
        return 2.32;
    }
}
class PNB extends RBI{
    @Override 
    double rate(){
        return 2.43;
    }
}

class Demo2{
    public static void main(String args[]){
        RBI robj;
         robj = new BOI();
         System.out.println("Final sum by boi : "+robj.finalSum(1000,robj.rate()));
         robj = new SBI();
         System.out.println("Final sum by sbi : "+robj.finalSum(1000,robj.rate()));
         robj = new PNB();
         System.out.println("Final sum by pnb : "+robj.finalSum(1000,robj.rate()));
    }
}