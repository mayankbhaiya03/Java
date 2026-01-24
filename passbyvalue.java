public class passbyvalue {
    static void changeValue(int a) {
        a *= 100;
        System.out.println("Inside changeValue: " + a);
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before changeValue: " + a);

        changeValue(a);
        System.out.println("After changeValue: " + a);
    }

}
