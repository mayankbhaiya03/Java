import java.util.Scanner;
//count the no. of triplets whose sum is ewual to target sum

public class targetsum {
    static int targetsum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target sum");
        int target = sc.nextInt();
        System.out.println(targetsum(arr, target));

    }

}
// find the total number of pairs in an array whose sum is equal to target sum
// public class targetsum {
// static int targetsum(int[] arr, int target) {
// int n = arr.length;
// int ans = 0;
// for (int i = 0; i < n; i++) {
// for (int j = i + 1; j < n; j++) {
// if (arr[i] + arr[j] == target) {
// ans++;
// }
// }
// }
// return ans;

// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter size of array");
// int n = sc.nextInt();
// int[] arr = new int[n];
// System.out.println("Enter elements of array");
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }
// System.out.println("Enter target sum");
// int target = sc.nextInt();
// System.out.println(targetsum(arr, target));

// }

// }
