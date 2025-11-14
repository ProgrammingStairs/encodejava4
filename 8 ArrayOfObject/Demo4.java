// example showing the concept of varargs (variable arguments) 

// without varargs
// class Demo4{
//     void test(int a,int b){
//         System.out.println("sum : "+(a+b));
//     }
//     void test(int a,int b,int c){
//         System.out.println("sum : "+(a+b+c));
//     }
//     void test(int a,int b,int c,int d){
//         System.out.println("sum : "+(a+b+c+d));
//     }
//     public static void main(String args[]){
//       Demo4 obj = new Demo4();
//       obj.test(45,56);
//       obj.test(45,56,54);
//       obj.test(4,5,5,6);
//     }
// }

// with varargs
// class Demo4{
//     void test(int...var){
//         System.out.println("No. of arguments : "+var.length);
//         int sum=0;
//         for(int element : var)
//         {
//             sum += element;
//         }
//         System.out.println("\nsum : "+sum);
//     }
//     public static void main(String...args){
//       Demo4 obj = new Demo4();
//       obj.test(45,56);
//       obj.test(45,56,54);
//       obj.test(4,5,5,6);
//     }
// }

// with varargs
class Demo4{
    void test(String name,int...var){
        System.out.println("No. of arguments : "+(var.length+1));
        int sum=0;
        for(int element : var)
        {
            sum += element;
        }
        System.out.println("\nName : "+name+" sum : "+sum);
    }
    public static void main(String...args){
      Demo4 obj = new Demo4();
      obj.test("noname",45,56);
      obj.test("noname",45,56,54);
      obj.test("noname",4,5,5,6);
    }
}