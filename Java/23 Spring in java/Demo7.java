// example showing the concept of string
import java.util.Scanner;
class Demo7{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter string : ");
      String str = sc.nextLine();
      String ch[] = str.split(" ");
      for(int j=0;j<ch.length;j++){
        char ch1[] = ch[j].toCharArray();
        for(int i=0;i<ch1.length/2;i++){
            char temp = ch1[i];
            ch1[i] = ch1[ch1.length-1-i];
            ch1[ch1.length-1-i] = temp;
        }      
        ch[j] = new String(ch1); 
      }
      for(String s : ch )  
        System.out.print(s+" ");
    }
}