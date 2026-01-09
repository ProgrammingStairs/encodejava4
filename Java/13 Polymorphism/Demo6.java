// example showing the concept of method overriding
class RBI{
    double rate(){
        return 1.0;
    }
}
class SBI extends RBI{
    double rate(){
        return 1.56;
    }
}
class BOI extends RBI{
    double rate(){
        return 2.34;
    }
}
class PNB extends RBI{}
class Demo6{
    public static void main(String args[]){
        SBI sobj = new SBI();
        BOI bobj = new BOI();
        PNB pobj = new PNB();
            System.out.println("rate provied by sbi : "+sobj.rate());
            System.out.println("rate provied by boi : "+bobj.rate());
            System.out.println("rate provied by pnb : "+pobj.rate());
    }
}

