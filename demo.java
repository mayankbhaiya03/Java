import java.util.Arrays;

public class demo {
    public static void main(String[] args) {

        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        for (int i = 0; i < 3; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                sum = sum + a[j][i];

            }
            System.out.println(sum);
        }

    }
}