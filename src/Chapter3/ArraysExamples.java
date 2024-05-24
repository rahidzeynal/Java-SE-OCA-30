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



        // Summing values of arrayInt
        int sum = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            sum += arrayInt[i];
        }
        System.out.println("Sum: " + sum);



        // Printing some specific output
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("- ");
            }
            System.out.println("-");
        }



        // It takes ? years for an initial investment of $10,000 to become $20,000 with a yearly 10% increase.
        double initial_value = 10000;
        double target_value = initial_value * 2;
        int countOfYear = 0;
        double rate = 0.10;
        do {
            initial_value += initial_value * rate;
            countOfYear++;
        } while (initial_value <= target_value);
        System.out.println(countOfYear);
    }
}
