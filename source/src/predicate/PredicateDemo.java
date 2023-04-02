package predicate;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        int[] arr = {1,3,2,4, 8,7};
        Predicate<Integer> p1 = x-> x % 2 == 0; // Predicate returns only a single value. Boolean - true/False
        Predicate<Integer> p2 = x-> x > 2;

        System.out.println("Print all even numbers");
        check(p1, arr);

        System.out.println("Print all Odd numbers");
        check(p1.negate(), arr); // return the inverse

        System.out.println("Print all numbers greater than two");
        check(p2, arr);

        System.out.println("Print numbers greater than two and Even number");
        check(p2.and(p1), arr);

        System.out.println("Print numbers greater than two or Even number");
        check(p2.or(p1), arr);

        int number = 50;

        Predicate<Integer> p3 = y->y>number;

       System.out.println(p3.test(51));


        System.out.println("// checking Function and Boolean combine");
        int input = 2;
        modifyValues(p1, arr, input);


    }

    public static void check(Predicate<Integer> predicate, int[] values) {
        for(Integer a: values) {
            if(predicate.test(a))
                System.out.println(a);
        }
    }

    // checking Function and Boolean combine
    // checking if conditions are met and multiplying the value by 2 if conditions are met.
    public static void modifyValues(Predicate<Integer> predicate, int [] values, int input) {
        Function<Integer, Integer> x = y->0;
        for (Integer val: values ) {
            if(predicate.test(val)) {
                x = x.andThen(y -> val * input);
                int returnValue = x.apply(input);
                System.out.println(returnValue);
            }
        }
    }

}
