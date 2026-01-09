// example showing the concept of string
class Demo3{
    public static void main(String args[]){
        String str1 = "Andrew Anderson";
        String str2 = "Andrew Anderson";
        String str3 = "Jackson Jack";
       
        String str4 = new String("Andrew Anderson");
        String str5 = new String("Andrew Anderson");
        String str6 = new String("Peter Parker");

        System.out.println("\nstr1==str2 : "+(str1==str2));
        System.out.println("\nstr1==str3 : "+(str1==str3));
        System.out.println("\nstr1==str4 : "+(str1==str4));
        System.out.println("\nstr4==str5 : "+(str4==str5));
        System.out.println("\nstr4==str6 : "+(str4==str6));

    }
}