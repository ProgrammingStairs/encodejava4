// example showing the concept of file handling in java
import java.io.*;
class Demo10{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\EncodeAI_batches\\encodejava4\\20 File Handling in java\\MyFolder\\mytextfile.txt");

        try(FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);){
            bw.write("statement 1");
            bw.newLine();
            bw.write("statement 2");
            bw.newLine();
            bw.write("statement 3");
            System.out.println("Data inserted successfully");
        }catch(IOException  e){
            System.out.println("Excption : "+e);
        }

        try(FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr)){
            // going to read data from a file
            while(true){
                int x = fr.read();
                if(x==-1)
                    break;
                System.out.print((char)x);
            }
        }catch(IOException e){
            System.out.println("Excption : "+e);
        }
    }
}