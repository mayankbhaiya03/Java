interface square1 {
    int sq(int n);
}

interface evenodd {
    String check(int n);

}

interface concat {
    String con(String a, String b);
}

public class square {
    public static void main(String[] args) {
        square1 s1 = n -> n * n;

        System.out.println(s1.sq(9));
        evenodd e1 = n -> {
            if (n % 2 == 0) {
                return "even";

            } else {
                return "odd";
            }

        };
        concat c1 = (a, b) -> a + b;

        System.out.println(c1.con("hello ", "world"));
    }
}

// to find max of two numbers using lambda
// lambda to convert a string into uppercase and lowercase
// num=11 print =22 using lambda if 30 so 60 using lambda