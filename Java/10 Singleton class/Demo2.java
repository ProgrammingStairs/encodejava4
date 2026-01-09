// example showing the concept of singleton class
// lazy initialization

class Singleton{
    private static Singleton instance;
    private Singleton(){}
    static Singleton getInstance(){
        if(instance==null){
            System.out.println("inside if : "+instance);
            instance = new Singleton();
        }
        return instance;
    }
    int num = 100;
    static void display(){
        System.out.println("created object : "+instance);
    }
}
class Demo2{
    public static void main(String args[]){
        Singleton.display();
        Singleton instance = Singleton.getInstance();
        System.out.println("Num : "+instance.num);
        instance.num += 100;
        System.out.println("Num : "+instance.num);
        
        Singleton instanceNew = Singleton.getInstance();
        System.out.println("Num : "+instanceNew.num);
        
    }
}