import java.util.Scanner;

public class multiarray {

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);-------------for 1D array for 2d array we have to
            // traverse twice;
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int[][] arr2 = { { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 },
        // };
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int r = sc.nextInt();
        System.out.println("enter the number of columns");
        int c = sc.nextInt();

        int[][] arr2 = new int[r][c];
        System.out.println("enter " + r * c + " elements");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                arr2[i][j] = sc.nextInt();
            }
        }
        printArray(arr2);

    }
}