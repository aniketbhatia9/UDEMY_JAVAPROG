package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;
        myVariable++;
        myVariable--;

        System.out.println("This is a test");

        System.out.println("This is " +
                "another " +
                "still more");

        int anothervariable = 50;
        myVariable--;
        System.out.println("This is another one");

        System.out.println("---------------------");



       int highscore = calculateScore(true,800,5,100);
       System.out.println("Your final score was " + highscore );

//        if (score < 5000 && score > 1000){
////            System.out.println("your score was less than 5000 but greater than 1000");
////        }else if (score < 1000){
////            System.out.println("your score was less than 1000");
////        }else{
////            System.out.println("Got here");
////        }



        System.out.println("----------Challenge-------------");

        highscore=calculateScore(true,10000,8,200);
        System.out.println("Your final score was " + highscore );

//        int a= 50;
//        int b =10;
//
//        int c;
//
//        c=(a<b) ? a : b;
//        System.out.println(c);

    }

    public static int calculateScore(boolean gameOver, int score, int levelcompleted, int bonus){

       if (gameOver){
            int finalscore = score + (levelcompleted * bonus);
            finalscore +=2000;
            return  finalscore;
       }
            return -1;

    }

}
