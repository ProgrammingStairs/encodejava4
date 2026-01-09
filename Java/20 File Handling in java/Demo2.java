// example showing the concept of file handling in java
import java.io.IOException;
import java.io.File;
class Demo2{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\EncodeAI_batches\\encodejava4\\20 File Handling in java\\MyFolder\\myfile.pptx");

        try{
            if(!file.exists()){
                file.createNewFile();
                System.out.println("File created successfully");
            }else{
                System.out.println("File already exists");
            }
        }catch(IOException  e){
            System.out.println("Excption : "+e);
        }
    }
}