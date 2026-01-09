// example showing the concept of file handling in java
import java.io.*;
class Product implements Serializable{
    int pid;
    String name;
    double price;

    Product(int pid,String name,double price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString(){
        return "{ pid : "+pid+" , name : "+name+"  , price : "+price+"}";
    }
}
class Demo8{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\EncodeAI_batches\\encodejava4\\20 File Handling in java\\MyFolder\\mytextfile.txt");

        Product pobj = new Product(101,"Soap",250.56);

        try(FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream oout = new ObjectOutputStream(fout);){
            // going to write in a file
            oout.writeObject(pobj);
            System.out.println("Data inserted successfully");
        }catch(IOException  e){
            System.out.println("Excption : "+e);
        }

        try(FileInputStream fin = new FileInputStream(file);
        ObjectInputStream oin = new ObjectInputStream(fin);){
            // going to read data from a file
            Product product = (Product)oin.readObject(); // downcasting
            System.out.println(product);
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Excption : "+e);
        }
    }
}