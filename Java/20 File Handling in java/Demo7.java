// example showing the concept of file handling in java
import java.io.*;
class Demo7{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\EncodeAI_batches\\encodejava4\\20 File Handling in java\\MyFolder\\mytextfile.txt");

        try(FileOutputStream fout = new FileOutputStream(file);
        DataOutputStream dout = new DataOutputStream(fout);
        FileInputStream fin = new FileInputStream(file);
        DataInputStream din = new DataInputStream(fin);){
            // going to write in a file
            dout.writeInt(1012);
            dout.writeDouble(56.67);
            dout.writeUTF("This is an example of DataOutputStream");
            System.out.println("Data inserted successfully");
            // going to read from a file
            System.out.println("Integer value : "+din.readInt());
            System.out.println("Double value : "+din.readDouble());
            System.out.println("String value : "+din.readUTF());
        }catch(IOException  e){
            System.out.println("Excption : "+e);
        }
    }
}