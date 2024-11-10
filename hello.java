import java.util.Scanner;
import java.util.Random;

public class hello {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = new Random().nextInt(100) + 1;

        System.out.println(number);

        int attempts = 4;
        int rounds = 3;

        System.out.println(
                "Guess a random number between 1 to 100. You will have 3 rounds of 4 attempts each to guess the number. ");

        System.out.println(
                "User Score is calculated by every round being worth 4 points and evey attempt worth 2 points. Your current User Score is 20");

        while (scanner.hasNext()) {

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
            if (attempts == 0) {
                attempts = 4;
                rounds--;
                System.out.println("You are on Round: " + rounds);
            } else if (rounds == 0) {
                System.out.println("You are out of rounds");
                break;
            }

            int userscore = (rounds * 4) + (attempts * 2);
            System.out.println("Current UserScore: " + userscore);
        }
        scanner.close();

    }
}