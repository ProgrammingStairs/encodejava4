// example showing the concept of switch control statement

import java.util.Scanner;
class Demo12{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter color : ");
       String color = sc.next();
       
       switch(color.toLowerCase()){
            case "red" : System.out.println("Red color");
                        break;
            case "green" : System.out.println("Green color");
                        break;
            default : System.out.println("Invalid color");
                    break;
       }
    }
}