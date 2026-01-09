// example showing the concept of file handling in java
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ByteArrayOutputStream;
class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Content : ");
        String data = sc.nextLine();

        File file1 = new File("D:\\desktop\\EncodeAI_batches\\encodejava4\\20 File Handling in java\\MyFolder\\myfile1.txt");
        File file2 = new File("D:\\desktop\\EncodeAI_batches\\encodejava4\\20 File Handling in java\\MyFolder\\myfile2.txt");

        try(FileOutputStream fout1 = new FileOutputStream(file1);
        FileOutputStream fout2 = new FileOutputStream(file2);
        ByteArrayOutputStream bout = new ByteArrayOutputStream();){

            byte bt[] = data.getBytes();
            bout.write(bt);
            bout.writeTo(fout1);
            bout.writeTo(fout2);
            // fout.close();
            System.out.println("Data inserted successfully");
        }catch(IOException  e){
            System.out.println("Excption : "+e);
        }
    }
}