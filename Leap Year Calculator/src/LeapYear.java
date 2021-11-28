public class LeapYear {
    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999 ){
            if(year%4==0){
                if(year%100==0 && year%400==0){
                        System.out.println("Leap");
                        return true;
                    }else if(year%4==0 && year%100!=0){
                    System.out.println("Leap");
                    return true;
                }else return false;
            }else return false;
        }else return false;

    }
}
