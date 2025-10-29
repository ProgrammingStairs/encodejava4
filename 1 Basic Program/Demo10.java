// program 
class Demo10{
    public static void main(String args[]){
        int a=5,b=100;
        String res1 = (a>10 && b<=1000) ? "statement 1" : "statement 2";
        String res2 = (a>10 || b<=1000) ? "statement 1" : "statement 2";
        
        System.out.println("res1 : "+res1);
        System.out.println("res2 : "+res2);
        System.out.println("res3 : "+(!true));
        System.out.println("res4 : "+(!!false));

    }
}