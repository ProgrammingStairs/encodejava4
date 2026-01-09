// example showing the concept of exception handling

// class not found : checked exception
class Demo8{
    public static void main(String args[]){
        try{
            Class.forName("Demo");
            System.out.println("Class Found..!!");
        }catch(ClassNotFoundException e){
            System.out.println("Exception : "+e);
        }
    }
}