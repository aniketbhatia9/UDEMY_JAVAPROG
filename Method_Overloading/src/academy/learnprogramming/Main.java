package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	int newScore = calculateScore("Aniket",500);
        System.out.println("New score is " + newScore);
        calculateScore(100);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score);
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }
}
