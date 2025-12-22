// example showing the concept of exception handling

class Demo6{
    String str;
    public static void main(String args[]){
        Demo6 obj = new Demo6();
        try{
            System.out.println("length : "+obj.str.length());
        }catch(NullPointerException e){
            System.out.println("Exception : "+e);
        }
    }
}