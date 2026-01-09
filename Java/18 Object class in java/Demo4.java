// example showing the concept of getClass()

class Demo4{
    public static void main(String args[]){
        Object obj = new String();
        Class c =  obj.getClass();
        System.out.println("signature : "+c);
        System.out.println("name : "+c.getName());
    }
}