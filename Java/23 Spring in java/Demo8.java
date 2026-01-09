// example showing the concept of string
class Demo8{
    public static void main(String args[]){
        // StringBuffer sb = new StringBuffer("Hello ");
        StringBuilder sb = new StringBuilder("Hello ");

        sb.append("Andrew");
        System.out.println("append : "+sb);

        sb.insert(6,"Peter ");
        System.out.println("insert : "+sb);

        sb.replace(6,11,"mathew ");
        System.out.println("replace : "+sb);

        sb.delete(6,13);
        System.out.println("delete : "+sb);

        sb.reverse();
        System.out.println("reverse : "+sb);

    }
}