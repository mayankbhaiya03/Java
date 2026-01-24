import java.util.Scanner;

public class arrmanipulation {
    // FIND THE FIRST REPEATING ELEMENT IN THE ARRAY---------------------------
    static int firstRepeatingNum(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;

    }

    // // FIND THE MAXIMUM AND SECONED MAX ELEMENT IN THE
    // ARRAY---------------------------
    // static int findMax(int[] arr) {
    // // int n = arr.length;
    // int mx = Integer.MIN_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > mx) {
    // mx = arr[i];
    // }

    // }
    // return mx;
    // }

    // static int findSecondMax(int[] arr) {
    // int mx = findMax(arr);
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == mx) {
    // arr[i] = Integer.MIN_VALUE;

    // }
    // }
    // int secondMax = findMax(arr);
    // return secondMax;
    // }
    // FIND THE UNIQUE ELEMENT IN THE ARRAY---------------------------

    // static int arrmanipulation(int[] arr) {
    // int n = arr.length;

    // for (int i = 0; i < n; i++) {
    // for (int j = i + 1; j < n; j++) {
    // if (arr[i] == arr[j]) {
    // arr[i] = -1;
    // arr[j] = -1;
    // }
    // }
    // }

    // int ans = -1;
    // for (int i = 0; i < n; i++) {
    // if (arr[i] > 0) {
    // ans = arr[i];
    // }
    // }
    // return ans; // ✔ now correct
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.println(findMax(arr));
        // System.out.println(findSecondMax(arr));
        System.out.println(firstRepeatingNum(arr));
    }

}
