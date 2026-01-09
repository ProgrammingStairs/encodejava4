// example showing the concept of interface 

interface Showable{
    int age = 18;
    void getAge();
}
class Demo2{
    public static void main(String args[]){
        // anonymous class
        Showable obj = new Showable(){
                @Override
                public void getAge(){
                    System.out.println("Age : "+age);
                }
        };
        obj.getAge();
    }
}