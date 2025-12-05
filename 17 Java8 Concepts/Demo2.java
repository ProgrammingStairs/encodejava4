// example showing the concept of lambda expression
import java.util.Scanner; 
interface Showable{
    void calculate();
}
class Demo2{
    public static void main(String args[]){
        Showable obj = ()->{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Sum : "+(a+b));
        };
        obj.calculate();
    }
}