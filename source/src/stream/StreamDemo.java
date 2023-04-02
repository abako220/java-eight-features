package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 12));
        // use filter for predicate
        List<Integer> evenNo = ll.stream().filter(x -> x % 2 == 0).parallel().collect(Collectors.toList());
        System.out.println(evenNo); // return even numbers

        // we want to perform an operation on the list of even numbers.
        // use map for operation
        List<Integer> newValues = evenNo.stream().map(number -> number * 2).parallel().toList();
        System.out.println(newValues);


        // Terminal Operation
        //1. To array()

        Stream<Integer> s = Stream.of(1,2, 3,7,6, 7);
        Object[] array = s.toArray();

        for(Object val : array) {
            System.out.print(val + " ");
        }
        //2 count.
        Stream<Integer> sx = Stream.of(1,2, 3,7,6, 7);
        Long count = sx.count();
        System.out.println(count);

        Stream<Integer> s1 = Stream.of(1,2, 3,7,6, 7);
        //foreach()
       // s1.forEach(e->System.err.print(e));

        //min() max()
        Stream<Integer> s2 = Stream.of(1,2,3,5,4);
        Optional<Integer> min = s2.min((x, y) -> x.compareTo(y));
        System.out.println("min " + min.get());
        Stream<Integer> s3 = Stream.of(1,2,3,5,4);
        Optional<Integer> max = s3.max((x, y) -> x.compareTo(y));
        System.out.println("max " + max.get());

        //anyMatch()
        System.out.println("anyMatch example");
        Stream<Integer> s4 = Stream.of(22, 13, 43, 18, 70);
        boolean b = s4.anyMatch(x -> x == 13); // return boolean true or false
        System.out.println(b);

        //allMatch();

        Stream<Integer> s5 = Stream.of(22, 11, 43, 16, 19);
        boolean b1 = s5.allMatch(x -> x % 2 == 0);
        System.out.println(b1);

        //nonMatch()
        Stream<Integer> s6 = Stream.of(22, 11, 43, 16, 19);
        boolean b2 = s5.noneMatch(x -> x % 2 == 0);
        System.out.println(b2);

        //todo complete the following functions
        /**
         * findAny() - Returns any match
         * findFirst() - return the first match
         * collect() - collect the List, map etc
         */
    }
}