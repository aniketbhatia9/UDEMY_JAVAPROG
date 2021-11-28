package academy.learnprogramming;

public class Challenge {

    public static void main (String args[]){
        calcFeetAndInchesToCentimeters(157);
        calcFeetAndInchesToCentimeters(13,1);
    }



    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet>=0 && (inches >=0 || inches <=12)){
            double centimeters=(feet*30.48) + (inches *2.54);
            System.out.println(centimeters + " cm");
        }else
            System.out.println("invalid value");
            return -1;

    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches>=0){
            double feet = (int)(inches/12);
            double remaininginches = (int) inches %12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remaininginches + " inches");
        }
            return -1;
    }



}
