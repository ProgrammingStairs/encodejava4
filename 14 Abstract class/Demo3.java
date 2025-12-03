// example showing the concept of abstract class 
import java.util.Scanner;
abstract class Series{
    abstract void series(int n,int m);
}
class EvenSeries extends Series{
    @Override
    void series(int n,int m){
        System.out.println("\nEven Number series : ");
        for(int i=n;i<=m;i++){
            if(i%2==0)
                System.out.print(i+"\t");
        }
    }
}
class OddSeries extends Series{
    @Override
    void series(int n,int m){
        System.out.println("\nOdd Number series : ");
        for(int i=n;i<=m;i++){
            if(i%2!=0)
                System.out.print(i+"\t");
        }
    }
}
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        EvenSeries eobj = new EvenSeries();
            eobj.series(n,m);
        OddSeries oobj = new OddSeries();
            oobj.series(n,m);
    }
}