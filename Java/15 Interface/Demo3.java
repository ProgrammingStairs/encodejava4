// example showing the concept of interface 

interface Showable{
    int age = 18;
    void getAge();
}
class Demo3{
    public static void main(String args[]){
        // anonymous class with anonymous object
        new Showable(){
                @Override
                public void getAge(){
                    System.out.println("Age : "+age);
                }
        }.getAge();
    }
}