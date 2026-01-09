// example showing the concept of command line argument
// class Demo3{
//     public static void main(String args[]){
//        System.out.println("No. of arguments : "+args.length); 
//        for(String element : args){
//         System.out.print(element+"\t");
//        } 
//     }
// }

// class Demo3{
//     public static void main(String args[]){
//        System.out.println("No. of arguments : "+args.length); 
//        int sum=0;
//        for(String element : args){
//         sum = sum + Integer.parseInt(element);
//        }
//         System.out.println("Sum : "+sum);
//     }
// }

class Demo3{
    public static void main(String args[]){
       System.out.println("No. of arguments : "+args.length); 
       for(int i=0;i<args.length/2;i++){
            String temp = args[i];
            args[i] = args[args.length-1-i];
            args[args.length-1-i] = temp;
       }
       for(String element : args)
        System.out.print(element+"\t");
    }
}