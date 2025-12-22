// example showing the concept of file handling in java
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
class Demo4{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\EncodeAI_batches\\encodejava4\\20 File Handling in java\\MyFolder\\myfile.txt");

        try(FileInputStream fin = new FileInputStream(file)){
            while(true){
                int x = fin.read();
                if(x==-1)
                    break;
                System.out.print((char)x);
            }
        }catch(IOException  e){
            System.out.println("Excption : "+e);
        }
    }
}