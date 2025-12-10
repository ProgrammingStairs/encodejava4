// example showing the concept of equals() 

class Complex{
    @Override
    public boolean equals(Object o){
        if(this==o)
            return true;
        else
            return false;
    }
}
class Demo3{
    public static void main(String args[]){
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        if(c1.equals(c2))
            System.out.println("Gets Entry");
        else
            System.out.println("Not gets entry");
    }
}