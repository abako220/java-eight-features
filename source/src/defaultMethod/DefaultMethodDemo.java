package defaultMethod;


public class DefaultMethodDemo implements First {

    public static void main(String [] args) {
        String x = "5";
        String y =  "2";

        //String s1 = String.valueOf(x);
        //String s2 = String.valueOf(y);

        if(x.contains(".") || y.contains(".")) {
            System.out.println("Please enter a valid Integer");
            return;
        }

        int x1 = Integer.valueOf(x);
        int y2 =  Integer.valueOf(y);
        int sum = new DefaultMethodDemo().method1(x1, y2);
        System.out.println(sum);
    }



}

interface First {
    // We use default to eliminate the constraint of implementing all methods in an interface.
    // a default method in an interface must have implementation.
    default int method1(int x, int y) {
        int sum = Math.abs(x) + Math.abs(y);
        return sum;
    }

    default int getNumber(int x) {
        return 0;
    }
}


interface Second {

}
