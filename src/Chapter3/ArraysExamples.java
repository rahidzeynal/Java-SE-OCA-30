package Chapter3;

import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {

        // Sorting numeric array
        int[] arrayInt = {10, 4, 6, 7, 3, 9, 8, 2, 1, 5};
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println();

        Arrays.sort(arrayInt);
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
    }
}
