package academy.learnprogramming;

public class Challenge {
    public static void main(String args[]){

        displayHighScorePosition("sachin",calculateHighScorePosition(1500));
        displayHighScorePosition("dhoni",calculateHighScorePosition(900));
        displayHighScorePosition("virat",calculateHighScorePosition(400));
        displayHighScorePosition("rohit",calculateHighScorePosition(50));
        displayHighScorePosition("hardik",calculateHighScorePosition(100));


    }

public static void displayHighScorePosition(String p_Name, int Position){
    System.out.println(p_Name + " managed to get into position " + Position + " on the high score table" );

    }
public static int calculateHighScorePosition(int score){
        if(score>=1000)
            return 1;
        else if(score >= 500 && score <1000  ){
            return 2;
    }else if (score >= 100 && score < 500 ){
            return 3;
        }else {
            return 4;
        }

    }
}
