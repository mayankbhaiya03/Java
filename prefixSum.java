import java.util.Scanner;

public class prefixSum {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makeprefixSum(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) { // i sould be start from 1
            arr[i] = arr[i - 1] + arr[i];

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];// probably for 1 based indexing
        System.out.println("enter " + n + " elements");
        // for (int i = 0; i < n; i++) {
        for (int i = 1; i <= n; i++) { // for 1 based indexing
            arr[i] = sc.nextInt();
        }
        System.out.println("Input Array");
        printArray(arr);

        int[] pref = makeprefixSum(arr);
        printArray(pref);

        System.out.println("enter no.of queries");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = pref[r] - pref[l - 1];

            System.out.println("sum " + ans);
        }

    }
}
