import java.util.Scanner;

class algebra {
    int sum(int a, int b) {
        return a + b;
    }
}

public class method {
    public static void main(String[] args) {
        algebra obj = new algebra();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = obj.sum(a, b);
        System.out.println(result);

        // standard library methods
        System.out.println(Math.sqrt(24));
        System.out.println(Math.sqrt(16));

        System.out.println(Math.floor(5.3));
        System.out.println(Math.floor(5.9));

        System.out.println(Math.ceil(5.3));
        System.out.println(Math.ceil(5.9));
    }

}
