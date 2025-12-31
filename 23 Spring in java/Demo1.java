// example showing the concept of string
class Demo1{
    public static void main(String args[]){
        // by string literal
        String str1 = "Andrew Anderson";
        // by new keyword
        String str2 = new String("Peter Parker");

        System.out.println("\nstr1 : "+str1);
        System.out.println("\nstr2 : "+str2);

        byte bt[] = {65,66,67,68,69};
        String str3 = new String(bt);
        System.out.println("\nstr3 : "+str3);
      
    }
}