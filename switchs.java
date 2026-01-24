import java.util.Scanner;

public class switchs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit) {
            // case "mango":
            // System.out.println("king of fruits");
            // break;
            // case "apple":
            // System.out.println("A sweet red friut");
            // break;
            // case "banana":
            // System.out.println("a big yellow fruit");
            // break;
            // default:
            // System.out.println("please enter a vaild fruit");
            // ----CLEANER VERSION----
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("prince of fruits");
            case "banana" -> System.out.println("villan of fruits");
            default -> System.out.println("invalid fruit");

        }

    }
}
