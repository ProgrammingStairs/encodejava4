// example showing the concept of array of object
import java.util.Scanner;
class Product{
    int pid;
    String name;
    double price;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product Id : ");
        pid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter product name : ");
        name = sc.nextLine();
        System.out.println("Enter product price : ");
        price = sc.nextDouble();
    }
    void display(){
        System.out.println("\nProduct Details\n");
        System.out.println("Id : "+pid);
        System.out.println("Name : "+name);
        System.out.println("Price : "+price);
    }
}
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of products : ");
        int size = sc.nextInt();

        Product pobj[] = new Product[size];
        for(int i=0;i<size;i++){
            pobj[i] = new Product();
            pobj[i].getData();
        }
        for(Product p :  pobj)
            p.display();
        
    }
}