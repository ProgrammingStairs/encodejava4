// example showing the concept of interface 

// interface Showable{
//     int a = 100;
// }
// class Demo9 implements Showable{
//     public static void main(String args[]){
//         System.out.println("value of a : "+a);
//     }
// }

interface Showable{
    int a = 100;
}
class Demo9{
    public static void main(String args[]){
        System.out.println("value of a : "+Showable.a);
    }
}