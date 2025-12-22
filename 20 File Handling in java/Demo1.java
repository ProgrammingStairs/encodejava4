// example showing the concept of file handling in java

import java.io.File;
class Demo1{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\EncodeAI_batches\\encodejava4\\20 File Handling in java\\MyFolder");

        if(!file.exists()){
            file.mkdir();
            System.out.println("Folder created successfully");
        }else{
            System.out.println("Folder already exists");
        }
    }
}