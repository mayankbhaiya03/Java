import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        // sum();
        // sum();
        // String messege = greet();
        // System.out.println(messege );
        int sum = sum2(3, 4);
        System.out.println(sum);

    }

    // static void sum() {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter a number1:");
    // int num1 = sc.nextInt();
    // System.out.println("Enter a number 2:");

    // int num2 = sc.nextInt();
    // int sum = num1 + num2;
    // System.out.println("the sum is " + sum);

    // }

    // static String greet() {
    // String greet = "how are you?";
    // return greet;
    // }
    // ----------------ARGUMENTS--------------------
    static int sum2(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
