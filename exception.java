import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter a number");

            int n = sc.nextInt();
            System.out.println(n);

        } catch (Exception e1) {
            System.out.println("invalid input");
            System.out.println(e1);
        }

    }

}
