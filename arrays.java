
public class arrays {
    void presentElement() {
        int[] arr = { 10, 20, 30, 40, 50 };
        int element = 36;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Element is present in array at index " + i);
            } else {
                System.out.println(-1);
            }
        }
    }

    void maxArray() {
        int[] arr = { 23, 45, 67, 89, 12, 90 };
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }

        }
        System.out.println("max value in array is " + ans);
    }

    void sumofArray() {
        int[] arr1 = { 1, 2, 35, 61, 12 };
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i];
            // System.out.println("sum of array is" + sum); //it will print like ->1 38 99
            // 111
        }
        System.out.println("sum of array is " + sum);// it will print only final sum ->111
    }

    void demoArrays() {
        int[] ages = new int[3];
        ages[0] = 12;
        ages[1] = 15;
        ages[2] = 20;
        System.out.println("FOR LOOP");
        for (int i = 0; i < 3; i++) {
            System.out.println(ages[i]);
        }

        // FOR EACH LOOP
        System.out.println("FOR EACH LOOP");
        for (int age : ages) {
            System.out.println(age);

        }

        // WHILE LOOP
        System.out.println("WHILE LOOP");
        int i = 0;
        while (i < 3) {
            System.out.println(ages[i]);
            i++;
            ;
        }

        // System.out.println(ages[0]);
        // System.out.println(ages[1]);
        // System.out.println(ages[2]);
        System.out.println("Array Length: " + ages.length);

    }

    void multiArray() {
        int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 } };
        // System.out.println(numbers[0][0]);
        // System.out.println(numbers[0][1]);
        // System.out.println(numbers[0][2]);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);

            }
        }
    }

    public static void main(String[] args)

    {
        arrays obj = new arrays();
        // obj.multiArray();
        // // obj.demoArrays();
        // obj.sumofArray();
        // obj.maxArray();
        obj.presentElement();
    }
}
