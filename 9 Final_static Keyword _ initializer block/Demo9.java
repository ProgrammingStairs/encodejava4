// class Demo9{
//     static int max=123;
//     static void printMax(){
//         System.out.println("max value : "+max);
//     }
//     public static void main(String args[]){
//         printMax();
//         Demo9.printMax();
//     }
// }

class Demo{
        static int max=123;
    static void printMax(){
        System.out.println("max value : "+max);
    }
}
class Demo9{
    public static void main(String args[]){
        Demo.printMax();
    }
}
