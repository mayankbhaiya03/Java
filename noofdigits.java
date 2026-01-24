import java.util.*;

public class noofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while (n > 0) {
            ans = (ans * 10) + n % 10;
            n = n / 10;

            // }
            // for (int i = 1; i <= n; i++) {
            // if (i % 2 == 0) {
            // System.out.println(ans -= i);
            // } else {
            // System.out.println(ans += i);
            // }

            // for (int i = 1; i <= n; i++) {
            // fact = fact * i;
        }

        System.out.println("the sum of digits of  the given no is:" + ans);
    }

}
