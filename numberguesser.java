import java.util.Scanner;
import java.util.Random;

public class numberguesser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = new Random().nextInt(100) + 1;

        System.out.println(number);

        int attempts = 4;
        int rounds = 3;
        int userscore = 100;

        System.out.println(
                "Guess a random number between 1 to 100. You will have 3 rounds of 4 attempts each to guess the number. ");

        while (scanner.hasNext()) {

            System.out.println("You Are on Round:" + rounds + " Attempt:" + (attempts - 1));
            int guess = scanner.nextInt();

            if (guess > number) {
                System.out.println("Your Guess Is To High");
                attempts--;

            } else if (guess < number) {
                System.out.println("Your guess is To Low");

                attempts--;
            } else if (guess == number) {
                System.out.println("Your Guess is Correct");

                break;

            }
            if (rounds == 1 && attempts == 0) {
                System.out.println("You are out of rounds");

                break;
            } else if (attempts == 0) {
                attempts = 4;
                rounds--;
                System.out.println("You are on Round: " + rounds);
            }

        }
        scanner.close();

    }
}