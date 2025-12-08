// example showing the concept of predicate

import java.util.function.Predicate; 
class Demo8{
    public static void main(String args[]){
        Predicate<Integer> lessThan = i -> i<=25;
        System.out.println("result : "+lessThan.test(50));
        System.out.println("result : "+lessThan.negate().test(50));

        Predicate<Integer> greaterThan = i -> i>=25;
        System.out.println("result : "+greaterThan.test(50));
      
        System.out.println("result : "+lessThan.and(greaterThan).test(100));
        System.out.println("result : "+lessThan.or(greaterThan).test(100));
      
        Predicate<String> str = Predicate.isEqual("Andrew");
        System.out.println("result : "+str.test("ANDREW"));
        System.out.println("result : "+str.test("Andrew")); 
    }
}