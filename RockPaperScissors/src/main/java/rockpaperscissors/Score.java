package rockpaperscissors;

public class Score {
    int userScore = 0;
    int computerScore = 0;

    public Score(int userScore, int computerScore) {
        this.userScore = userScore;
        this.computerScore = computerScore;
    }

    public int getUserScore() {
        return userScore;
    }

    public void setUserScore(int userScore) {
        this.userScore = userScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }
    

    public void displayScore() {
        System.out.println("Score is User: " + userScore + " Computer: " + computerScore + "\n");
    }

    
}
