class Demo7{
    static int count=0;
    Demo7(){
        count++;
    }
    static int getCount(){
        return count;
    }
    public static void main(String args[]){
        new Demo7();
        new Demo7();
        new Demo7();
        new Demo7();
        new Demo7();
        System.out.println("No. of objects created : "+Demo7.getCount());
    }
}