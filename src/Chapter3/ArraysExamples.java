package Chapter3;

import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {

        // Sorting numeric array
        System.out.print("Unsorted version of our array: ");
        int[] arrayInt = {10, 4, 6, 7, 3, 9, 8, 2, 1, 5};
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println();

        System.out.print("Sorted version of our array: ");
        Arrays.sort(arrayInt);
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println();
        int sum = 0;
        // Summing values of arrayInt
        for (int i = 0; i < arrayInt.length; i++) {
            sum += arrayInt[i];
        }
        System.out.println("Sum: " + sum);
    }
}
