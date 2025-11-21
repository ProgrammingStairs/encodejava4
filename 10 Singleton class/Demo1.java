// example showing the concept of singleton class
// eager initialization

class Singleton{
    private final static Singleton instance = new Singleton();
    private Singleton(){}
    static Singleton getInstance(){
        return instance;
    }
    int num = 100;
    static void display(){
        System.out.println("created object : "+instance);
    }
}
class Demo1{
    public static void main(String args[]){
        Singleton.display();
        // Singleton instance = Singleton.getInstance();
        // System.out.println("Num : "+instance.num);
        // instance.num += 100;
        // System.out.println("Num : "+instance.num);
        
        // Singleton instanceNew = Singleton.getInstance();
        // System.out.println("Num : "+instanceNew.num);
        
    }
}