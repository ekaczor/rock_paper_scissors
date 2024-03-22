package rockpaperscissors;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Score score = new Score(0,0);
        int computerScore = 0;
        int userScore = 0;

        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!");
        while (true) {
            clearConsole();
            System.out.println(" ____   ___     __  __  _      ____   ____  ____   ___  ____        _____   __  ____ _____ _____  ___   ____    _____\r\n" + //
                        "|    \\ /   \\   /  ]|  |/ ]    |    \\ /    ||    \\ /  _]|    \\      / ___/  /  ]|    / ___// ___/ /   \\ |    \\  / ___/\r\n" + //
                        "|  D  )     | /  / |  ' /     |  o  )  o  ||  o  )  [_ |  D  )    (   \\_  /  /  |  (   \\_(   \\_ |     ||  D  )(   \\_ \r\n" + //
                        "|    /|  O  |/  /  |    \\     |   _/|     ||   _/    _]|    /      \\__  |/  /   |  |\\__  |\\__  ||  O  ||    /  \\__  |\r\n" + //
                        "|    \\|     /   \\_ |     \\    |  |  |  _  ||  | |   [_ |    \\      /  \\ /   \\_  |  |/  \\ |/  \\ ||     ||    \\  /  \\ |\r\n" + //
                        "|  .  \\     \\     ||  .  |    |  |  |  |  ||  | |     ||  .  \\     \\    \\     | |  |\\    |\\    ||     ||  .  \\ \\    |\r\n" + //
                        "|__|\\_|\\___/ \\____||__|\\_|    |__|  |__|__||__| |_____||__|\\_|      \\___|\\____||____|\\___| \\___| \\___/ |__|\\_|  \\___|\r\n" + //
                        "                                                                                                                     ");
            score.displayScore();
            String[] rps = { "R", "P", "S" };
            String computerMove = rps[new Random().nextInt(rps.length)];
            String playerMove;

            while (true) {

                System.out.println("Please enter your move ((R)Rock, (P)Paper or (S)Scissors)");
                playerMove = scanner.nextLine();
                try {
                    Thread.sleep(750);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                

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
                    score.setComputerScore(++computerScore);
                } else if (computerMove.equalsIgnoreCase("s")) {
                    System.out.println("You win!");
                    score.setUserScore(++userScore);
                }
            } else if (playerMove.equalsIgnoreCase("p")) {
                if (computerMove.equalsIgnoreCase("r")) {
                    System.out.println("You win!");
                    score.setUserScore(++userScore);
                } else if (computerMove.equalsIgnoreCase("s")) {
                    System.out.println("You lose!");
                    score.setComputerScore(++computerScore);
                }
            } else if (playerMove.equalsIgnoreCase("s")) {
                if (computerMove.equalsIgnoreCase("p")) {
                    System.out.println("You win!");
                    score.setUserScore(++userScore);
                } else if (computerMove.equalsIgnoreCase("r")) {
                    System.out.println("You lose!");
                    score.setComputerScore(++computerScore);
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

     public static void clearConsole() {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }}
}
