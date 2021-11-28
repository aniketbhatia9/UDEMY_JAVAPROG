public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking){
            if(hourOfDay < 8 && hourOfDay >= 0 || hourOfDay > 22 && hourOfDay < 24){
                System.out.println("True");
                return true;
            }else
                return false;
        }
        if(!barking){
            System.out.println("False");}
            return false;

    }
}
