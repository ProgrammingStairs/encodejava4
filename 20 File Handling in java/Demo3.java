// example showing the concept of file handling in java
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Content : ");
        String data = sc.nextLine();

        File file = new File("D:\\desktop\\EncodeAI_batches\\encodejava4\\20 File Handling in java\\MyFolder\\myfile.txt");

        try(FileOutputStream fout = new FileOutputStream(file,true)){
            byte bt[] = data.getBytes();
            fout.write(bt);
            // fout.close();
            System.out.println("Data inserted successfully");
        }catch(IOException  e){
            System.out.println("Excption : "+e);
        }
    }
}