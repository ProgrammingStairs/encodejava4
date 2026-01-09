class Demo{
    static{
        System.out.println("static of Demo class runs");
    }
}
class Demo6{
    static{
        System.out.println("static of Demo6 class runs");
    }
    public static void main(String args[]){
        new Demo();
        new Demo();
        System.out.println("main method statement");
    }
}