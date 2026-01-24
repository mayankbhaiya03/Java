import java.util.*;

public class array1 {
    // ---------------INPUT FROM USER AND PRINTING ARRAY ELEMENTS------------
    static int[] smallestandlargest(int[] arr) {
        Arrays.sort(arr);
        int[] ans = { arr[0], arr[arr.length - 1] };
        return ans;
    }

    static boolean isSorted(int[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    static int strictlygreater(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }

        }
        return count;

    }

    static int lastOccurance(int[] arr, int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }
    // void occurance() {
    // int[] arr = { 1, 2, 3, 2, 4, 2, 5 };
    // int target = 2;
    // int count = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == target) {
    // count = count + 1;
    // }
    // }
    // System.out.println("The occurances of " + target + " is: " + count);
    // }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        // array1 obj = new array1();
        // obj.occurance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter" + n + "elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the value of x");
        int x = sc.nextInt();

        int result = lastOccurance(arr, x);
        System.out.println("The last occurance of " + x + " is at index: " + result);
        int result2 = strictlygreater(arr, x);
        System.out.println("The number of elements strictly greater than " + x + " is: " + result2);
        boolean sorted = isSorted(arr);
        System.out.println("The array is sorted: " + sorted);
        // System.out.println("you have entered");
        // // for (int i = 0; i < arr.length; i++) {
        // // System.out.println(arr[i]);
        // // }
        // printArray(arr);

        // // int arr2[] = arr;// reference copy
        // // int arr2[] = arr.clone();// deep copy
        // // int arr2[] = Arrays.copyOf(arr, arr.length);
        // int arr2[] = Arrays.copyOfRange(arr, 1, 4);// deep copy using copy of range
        // (to:4 gives 4-1=3)
        // System.out.println("printing arr2");
        // printArray(arr2);

        // // arr2[0] = 100;
        // // arr2[1] = 200;

        // System.out.println("after changing arr2 original array is");
        // printArray(arr);
        // System.out.println("after changing arr2 new array is");
        // printArray(arr2);
        int[] ans = smallestandlargest(arr);
        System.out.println("smallest" + " " + ans[0] + " " + "largest" + " " + ans[1]);
    }

}
