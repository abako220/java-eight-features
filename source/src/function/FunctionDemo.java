package function;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String [] args) {
        StringBuilder param = new StringBuilder();
        param.append("Troy");

        Function<Integer, Integer> res = value -> value / 2; //4/2 = 2
        res = res.compose(value-> value + 6 ); //6+6 =12 compose evaluate what is inside compose() before evaluating
                                                // what is in the function return value;
        System.out.println(res.apply(6)); // takes the input
    }


}
