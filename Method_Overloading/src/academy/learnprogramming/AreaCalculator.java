package academy.learnprogramming;


public class AreaCalculator {

    //private static final double INVALID_MESSAGE = -1.0;

   public static void main(String args[]){
        area(1.0);
        area(0.0,0.0);

    }


public static double area(double radius){
    if(radius>=0.0){
        double area=Math.PI*radius*radius;
        System.out.println(area);
    }//else
       // System.out.println("-1.0");
        return 0.0;

}

    public static double area(double x, double y){
    if(x>=0 && y >=0){
        double area = x*y;
        System.out.println(area);
    }//else
       // System.out.println("-1.0");
    return 0.0;
}

}
