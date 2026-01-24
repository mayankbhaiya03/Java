import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter a number:");
        // int n = sc.nextInt();

        // //FOR LOOP-----------------------------

        // for (int i = 1; i <= n; i++) {
        // System.out.println(i + " ");
        // System.out.println("hello world");
        // }
        // WHILE LOOP----------------------------------
        // int num = 1;
        // while (num <= 5) {
        // System.out.println(num);
        // num += 1;
        // }
        // DO WHILE LOOP------------------------------------
        // int i = 1;
        // do {
        // System.out.println(i);
        // i += 1;
        // } while (i <= 5);
        // find the largest no.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter a three no.:");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int max = a;
        // if (b > max) {
        // max = b;
        // }
        // if (c > max) {
        // max = c;
        // }
        // System.out.println(max);
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int a = 0;
        // int b = 1;
        // int count = 2;
        // while (count <= n) {
        // int temp = b;
        // b = b + a;
        // a = temp;
        // count++;

        // }
        // System.out.println(b);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                continue;

            }
            System.out.println(i);
        }

    }
}
