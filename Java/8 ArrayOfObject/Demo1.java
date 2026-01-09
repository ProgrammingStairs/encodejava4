// example showing the concept of array of object

class Product{
    int pid;
    String name;
    double price;
    Product(int pid,String name,double price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }
    void display(){
        System.out.println("\nProduct Details\n");
        System.out.println("Id : "+pid);
        System.out.println("Name : "+name);
        System.out.println("Price : "+price);
    }
}
class Demo1{
    public static void main(String args[]){
        Product pobj[] = new Product[2];
        System.out.println("pobj[0] : "+pobj[0]);
        System.out.println("pobj[1] : "+pobj[1]);

        pobj[0] = new Product(10101,"Soap",900.76);
        pobj[1] = new Product(10102,"Fairness Cream",90.76);
        
        System.out.println("pobj[0] : "+pobj[0]);
        System.out.println("pobj[1] : "+pobj[1]);

        for(Product p :  pobj)
            p.display();
        
    }
}