import java.util.Scanner;

public class spiralmatrix {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void spiralorder(int[][] matrix, int r, int c) {
        int topRow = 0;
        int bottomRow = r - 1;
        int leftColumn = 0;
        int rightColumn = c - 1;
        int totalELements = 0;

        while (totalELements < r * c) {
            // // topRow----leftcol to rightcol
            // for (int j = leftColumn; j <= rightColumn && totalELements < r * c; j++) {
            // System.out.print(matrix[topRow][j] + " ");
            // totalELements++;
            // }
            // topRow++;
            // // rightColumn----toprow to bottomrow
            // for (int i = topRow; i <= bottomRow && totalELements < r * c; i++) {
            // System.out.print(matrix[i][rightColumn] + " ");
            // totalELements++;
            // }
            // rightColumn--;

            // // bottomRow----rightcol to leftcol
            // for (int j = rightColumn; j >= leftColumn && totalELements < r * c; j--) {
            // System.out.print(matrix[bottomRow][j] + " ");
            // totalELements++;
            // }
            // bottomRow--;

            // // leftColumn----bottomrow to toprow
            // for (int i = bottomRow; i >= topRow && totalELements < r * c; i--) {
            // System.out.print(matrix[i][leftColumn] + " ");
            // totalELements++;

            // }
            // leftColumn++;
            // LEFTCOLUMN-----------TR TO BR
            for (int i = topRow; i <= bottomRow && totalELements < r * c; i++) {
                System.out.print(matrix[i][leftColumn] + " ");
                totalELements++;
            }
            leftColumn++;

            // BOTTOMROW------------LC TO RC
            for (int j = leftColumn; j <= rightColumn && totalELements < r * c; j++) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalELements++;
            }
            bottomRow--;
            // RIGHTCOLUMN----------BR TO TR
            for (int i = bottomRow; i >= topRow && totalELements < r * c; i--) {
                System.out.print(matrix[i][rightColumn] + " ");
                totalELements++;
            }
            rightColumn--;
            // TopROW-------------RC TO LC
            for (int j = rightColumn; j >= leftColumn && totalELements < r * c; j--) {
                System.out.print(matrix[topRow][j]);
                totalELements++;

            }
            topRow++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and column");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int total = r * c;
        System.out.println("Enter " + total + " values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);
        System.out.println("Spiral order");
        spiralorder(matrix, r, c);
    }

}
