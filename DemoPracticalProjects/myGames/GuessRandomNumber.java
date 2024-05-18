package myGames;
import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Defining range
        System.out.print("For this game, first you have to define a range. Let's do it...\nEnter minimum value of your range: ");
        int minValue = scanner.nextInt();
        System.out.print("Enter maximum value of your range: ");
        int maxValue = scanner.nextInt();

        // Guessing number from defined range
        int secretNumber = random.nextInt(minValue, maxValue);
        System.out.println(secretNumber);
        System.out.println("Now you have to find my guessed number from this range in 5 attempt...\nCan you do it? :)");

        // This is used for user attempt count
        int attemptCount = 0;
        while(attemptCount < 5){
            // Gets number from user
            int yourGuess = scanner.nextInt();

            attemptCount ++;

            // Check if user failed
            if (attemptCount == 5 && yourGuess != secretNumber){
                System.out.println("Unfortunately you couldn't find my secret number :(\nIt was -> [" + secretNumber + "]");
            } else {
                if (yourGuess >= minValue && yourGuess <= maxValue) {
                    if (yourGuess == secretNumber) {
                        System.out.println("Congrats!!!\nYou found my secret number at your " + attemptCount + " attempt!!!");
                        break;
                    } else if (yourGuess > secretNumber) {
                        System.out.println("Try a bit lower one...");
                    } else {
                        System.out.println("Try a bit higher one...");
                    }
                } else {
                    System.out.println("You entered a guessed number as " + yourGuess + " and it's out of our range.\n" +
                            "Please try to enter number in a range [" + minValue + ", " + maxValue + "]...");
                }
            }
        }
    }
}
