// example showing the concept of string
class Demo9{
    public static void main(String args[]){
        String s1 = "Andrew Anderson";
        System.out.println("uppercase : "+s1.toUpperCase());

        String s2 = "PETER PARKER";
        System.out.println("lowercase : "+s2.toLowerCase());
        
        String s3 = "            Jack       Johnson          ";
        System.out.println("trim : "+s3.trim());
        
        String s4 = "This is an example of String";
        System.out.println("index : "+s4.indexOf('n'));
        System.out.println("lastIndexOf : "+s4.lastIndexOf('n'));
        
        // equals, compareTo, toCharArray, split, getBytes

        String s5 = "Peter";
        System.out.println("equalsIgnoreCase : "+s5.equalsIgnoreCase("PETER"));
        
        s1.concat(s2);
        System.out.println("concat : "+s1);
        System.out.println("concat : "+s1.concat(s2));
        
        String s = String.join("-","02","01","2026");
        System.out.println("join : "+s);

        String s6 = "Peter";
        System.out.println("length : "+s6.length());

        String s7 = "This is an example";
        System.out.println("startsWith : "+s7.startsWith("This"));
        System.out.println("endsWith : "+s7.endsWith("example"));
        System.out.println("contains : "+s7.contains("example"));

    }
}