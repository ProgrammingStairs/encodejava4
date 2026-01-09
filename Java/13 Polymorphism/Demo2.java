// examplw showing the concept of method overloading 
class Greater{
    void greater(int a,int b){
        int result = a>b?a:b;
        System.out.println("Greater Number : "+result);
    }
    void greater(double a,double b){
        double result = (a>b) ? a : b;
        System.out.println("Greater Number : "+result);
    }
}
class Demo2{
    public static void main(String args[]){
        Greater obj = new Greater();
        obj.greater(45,567);
        obj.greater(32.23,33);
    }
}

