import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        // int salary = 24000;
        // if (salary > 20000) {
        // salary += 3000;
        // } else if (salary > 15000) {
        // salary += 5000;
        // } else {
        // salary += 1000;
        // }
        // System.out.println(salary);
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age:");
        int num = sc.nextInt();
        if (num < 12) {
            System.out.println("child");
        } else if (num >= 12 && num < 19) {
            System.out.println("teenager");
        } else {
            System.out.println("adult");
        }

    }
}
