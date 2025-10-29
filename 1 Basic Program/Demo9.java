// program 
class Demo9{
    public static void main(String args[]){
        int a=5,b=6,c;
//            5   + 5   + 6   - 5   -  4 
        // c = a++ + --b + a-- - a-- - --b;
        // System.out.println("c = "+c);

    //        5 - 5 + 4 + 3 - 2 - 1
        // c = --b - b++ + --a + --a - --a - --a;
        // System.out.println("c = "+c);

        c = --a - a++ + --b + --b - a++ - a++;
        System.out.println("c = "+c);

    }
}