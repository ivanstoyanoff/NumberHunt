import java.util.Random;
import java.util.Scanner;

public class NumberHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random randomNumber = new Random();
        int hiddenNumber = randomNumber.nextInt(100);

        while (true) {
            System.out.print("Guess a number (1-100): ");
            String playerInput = scanner.nextLine();

            boolean isValid = true;

            for (int i = 0; i < playerInput.length(); i++) {
                if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57) {
                    isValid = false;
                    System.out.println("Invalid input. Please enter a number.");
                    break;
                }
            }
            if (isValid) {
                int playerNumber = Integer.parseInt(playerInput);
                if (playerNumber == hiddenNumber) {
                    System.out.println("Congratulations! You guessed the hidden number!");
                    break;
                } else if (playerNumber < hiddenNumber) {
                    System.out.println("Your guess is too low. Try a higher number.");
                } else {
                    System.out.println("Your guess is too high. Try a lower number.");
                }
            }
        }
    }
}
