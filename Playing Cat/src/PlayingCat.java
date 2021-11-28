public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer && temperature >= 25 && temperature <= 45){
            System.out.println("True");
            return true;
        }else if(!summer && temperature >= 25 && temperature <= 35){
            System.out.println("true");
            return true;
        }else return false;
    }
}