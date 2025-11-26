// examplw showing the concept of constructor overloading 
class Greater{
    Greater(int a,double b){
        double result = a>b?a:b;
        System.out.println("Greater Number : "+result);
    }
    Greater(double a,int b){
        double result = (a>b) ? a : b;
        System.out.println("Greater Number : "+result);
    }
}
class Demo3{
    public static void main(String args[]){
        new Greater(45,56.7);
        new Greater(32.23,33);
    }
}

