// example showing the concept of string
class Demo2{
    public static void main(String args[]){
        String str1 = "Andrew Anderson";
        String str2 = "Andrew Anderson";
        String str3 = "Jackson Jack";
       
        String str4 = new String("Andrew Anderson");
        String str5 = new String("Andrew Anderson");
        String str6 = new String("Peter Parker");

        System.out.println("\nstr1.equals(str2) : "+str1.equals(str2));
        System.out.println("\nstr1.equals(str3) : "+str1.equals(str3));
        System.out.println("\nstr1.equals(str4) : "+str1.equals(str4));
        System.out.println("\nstr4.equals(str5) : "+str4.equals(str5));
        System.out.println("\nstr4.equals(str6) : "+str4.equals(str6));

    }
}