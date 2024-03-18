package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!");
        while (true) {

            String[] rps = { "R", "P", "S" };
            String computerMove = rps[new Random().nextInt(rps.length)];
            String playerMove;

            while (true) {

                System.out.println("\nPlease enter your move (R, P or S)");
                playerMove = scanner.nextLine();

                if (playerMove.equalsIgnoreCase("r") || playerMove.equalsIgnoreCase("p")
                        || playerMove.equalsIgnoreCase("s")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move.");
            }
            System.out.println("\nComputer: " + computerMove);

            if (playerMove.equalsIgnoreCase(computerMove)) {
                System.out.println("The game was a tie!");
            } else if (playerMove.equalsIgnoreCase("r")) {
                if (computerMove.equalsIgnoreCase("p")) {
                    System.out.println("You lose!");
                } else if (computerMove.equalsIgnoreCase("s")) {
                    System.out.println("You win!");
                }
            } else if (playerMove.equalsIgnoreCase("p")) {
                if (computerMove.equalsIgnoreCase("r")) {
                    System.out.println("You win!");
                } else if (computerMove.equalsIgnoreCase("s")) {
                    System.out.println("You lose!");
                }
            } else if (playerMove.equalsIgnoreCase("s")) {
                if (computerMove.equalsIgnoreCase("p")) {
                    System.out.println("You win!");
                } else if (computerMove.equalsIgnoreCase("r")) {
                    System.out.println("You lose!");
                }
            }
            System.out.println("\nPlay again? (y/n)");
            String playAgain = scanner.nextLine();
            if (!playAgain.equalsIgnoreCase("y")) {
                System.out.println("Thank you for Playing!");
                break;
            }
        }
        scanner.close();
    }
}
