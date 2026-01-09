// example showing the concept of string
import java.util.Scanner;
class Demo6{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter string : ");
      String str = sc.nextLine();
      String ch[] = str.split(" ");
      for(int i=0;i<ch.length/2;i++){
        String temp = ch[i];
        ch[i] = ch[ch.length-1-i];
        ch[ch.length-1-i] = temp;
      }      
      for(String s : ch )  
        System.out.print(s+" ");
    }
}