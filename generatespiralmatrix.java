import java.util.Scanner;

public class generatespiralmatrix {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] generatespiralmatrix(int n) {
        int[][] matrix = new int[n][n];
        int topRow = 0;
        int bottomRow = n - 1;
        int leftColumn = 0;
        int rightColumn = n - 1;
        int curr = 1;

        while (curr <= n * n) {
            // topRow----leftcol to rightcol
            for (int j = leftColumn; j <= rightColumn && curr <= n * n; j++) {
                matrix[topRow][j] = curr++;

            }
            topRow++;
            // rightColumn----toprow to bottomrow
            for (int i = topRow; i <= bottomRow && curr <= n * n; i++) {
                matrix[i][rightColumn] = curr++;

            }
            rightColumn--;

            // bottomRow----rightcol to leftcol
            for (int j = rightColumn; j >= leftColumn && curr <= n * n; j--) {
                matrix[bottomRow][j] = curr++;

            }
            bottomRow--;

            // leftColumn----bottomrow to toprow
            for (int i = bottomRow; i >= topRow && curr <= n * n; i--) {
                matrix[i][leftColumn] = curr++;

            }
            leftColumn++;
        }
        return matrix;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();
        int[][] matrix = generatespiralmatrix(n);
        printMatrix(matrix);

    }

}
