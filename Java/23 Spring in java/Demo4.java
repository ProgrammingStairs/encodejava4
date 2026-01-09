// example showing the concept of string
class Demo4{
    public static void main(String args[]){
        String str1 = "Andrew Anderson";
        String str2 = "Andrew Anderson";
        String str3 = "Jackson Jack";
       
        String str4 = new String("Andrew Anderson");
        String str5 = new String("Andrew Anderson");
        String str6 = new String("Peter Parker");

        System.out.println("\nstr1.compareTo(str2) : "+(str1.compareTo(str2)));
        System.out.println("\nstr1.compareTo(str3) : "+(str1.compareTo(str3)));
        System.out.println("\nstr1.compareTo(str4) : "+(str1.compareTo(str4)));
        System.out.println("\nstr4.compareTo(str5) : "+(str4.compareTo(str5)));
        System.out.println("\nstr4.compareTo(str6) : "+(str4.compareTo(str6)));

    }
}