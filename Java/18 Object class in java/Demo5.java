// example showing the concept of finalize()
@Deprecated 
class Demo5{
    @Override 
    protected void finalize(){
        System.out.println("object is going to be garbage collected");
    }
    public static void main(String args[]){
        Demo5 obj = new Demo5();
        System.out.println("hashCode : "+obj.hashCode());

        obj = null;
        System.gc();
    }
}