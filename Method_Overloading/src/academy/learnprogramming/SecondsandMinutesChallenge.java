package academy.learnprogramming;

public class SecondsandMinutesChallenge {

    public static void main(String args[]){
        getDurationString(65,45);
        getDurationString(3945);
    }

    public static int getDurationString(int minutes, int seconds){
        if(minutes>=0 && (seconds>=0 || seconds <=59) ){
            int hours=(minutes/60);
            int remainingminutes = (minutes%60);
            System.out.println(hours + "h " + remainingminutes + "m " + seconds + "s");
        }else
            System.out.println("invalid value");
            return -1;
    }

    public static int getDurationString(int seconds){
        if(seconds>=0){
            int minutes=seconds/60;
            int remainingseconds=seconds%60;
            System.out.println("Minutes = " + minutes + "Seconds = " + remainingseconds );
            getDurationString(minutes,remainingseconds);
        }else
            System.out.println("Invalid value");

        return -1;
    }

}
