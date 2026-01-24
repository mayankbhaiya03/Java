import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("please enter a roll no:");
        int rollno = input.nextInt();
        System.out.println("your roll no is" + rollno);

        System.out.print("please enter a marks:");
        float marks = input.nextFloat();
        System.out.println("your marks is " + marks);

        char ch = 'A';
        System.out.println("the character is " + ch);
        int x = (int) ch;// type casting(to get ascii value)
        System.out.println("the ascii value of " + ch + " is " + x);

    }

}
