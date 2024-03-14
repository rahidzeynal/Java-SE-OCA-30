package myUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("-------- Welcome to my Calculator --------");
        while (true) { // In this way we can run our program continuously
            Scanner scanner = new Scanner(System.in);
            System.out.println("--- Choose the operation U want to do. ---");
            System.out.println("---       +     -> for addition.       ---");
            System.out.println("---       -     -> for subtraction.    ---");
            System.out.println("---       /     -> for division.       ---");
            System.out.println("---       *     -> for multiplication. ---");
            System.out.println("---       %     -> for modulus.        ---");
            System.out.println("---       q     -> for breaking.       ---");

            char operation = scanner.next().charAt(0);
            if (operation != '+' & operation != '-' & operation != '/' & operation != '*' & operation != '%' & operation != 'q'){
                System.out.println("You chose wrong operation");
            }else {
                if (operation == 'q') {
                    System.out.println("You chose 'q' for quit.\nBig thanks for using my Calculator Class.");
                    break;
                }
                double numberDouble1;
                double numberDouble2;
                try {
                    System.out.print("Enter the 1st number: ");
                    numberDouble1 = scanner.nextDouble();
                    System.out.print("Enter the 2nd number: ");
                    numberDouble2 = scanner.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid data type is entered for calculation... ");
//                    scanner.nextLine();  // Clears the buffer(Found from internet but didn't see any benefits and commented out)
                    continue;
                }

                double resultDouble;
                if (operation == '+') {
                    System.out.print("You chose addition (+) operation and here is your result ");
                    resultDouble = addition(numberDouble1, numberDouble2);
                    System.out.println(resultDouble);
                } else if (operation == '-') {
                    System.out.print("You chose subtraction (-) operation and here is your result ");
                    resultDouble = subtraction(numberDouble1, numberDouble2);
                    System.out.println(resultDouble);
                } else if (operation == '/') {
                    if (numberDouble2 != 0) {
                        System.out.print("You chose division (/) operation and here is your result ");
                        resultDouble = division(numberDouble1, numberDouble2);
                        System.out.println(resultDouble);
                    } else {
                        System.out.println("You tried to do division by zero...");
                    }
                } else if (operation == '*') {
                    System.out.print("You chose multiplication (*) operation and here is your result ");
                    resultDouble = multiplication(numberDouble1, numberDouble2);
                    System.out.println(resultDouble);
                } else {
                    if (numberDouble2 != 0) {
                        System.out.print("You chose modulus (%) operation and here is your result ");
                        resultDouble = modulus(numberDouble1, numberDouble2);
                        System.out.println(resultDouble);
                    } else {
                        System.out.println("You tried to do division by zero...");
                    }
                }
            }
        }
    }

    public static Double addition(double number1, double number2) {
        return number1 + number2;
    }

    public static Double subtraction(double number1, double number2) {
        return number1 - number2;
    }

    public static Double division(double number1, double number2) {

        return number1 / number2;
    }

    public static Double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    public static Double modulus(double number1, double number2) {
        return number1 % number2;
    }
}
