package functionalInterface;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class FunctionalInterface implements Parent {

    public static void main(String[] args) {
        AtomicInteger sum = new AtomicInteger();

        Parent i = (int[] arr) -> {
            for (Integer x : arr) {
                sum.set(sum.get() + x);
            }
            return sum.get();
        };
        int[] num = {1, 3, 3};
        int ans = i.sum(num);
        System.out.println(ans);
    }


}
    @java.lang.FunctionalInterface
    interface Parent {
        public abstract int sum(int[] numbers);

    }

    @java.lang.FunctionalInterface
    interface Child  {
        public abstract int multiply(int a);
    }



