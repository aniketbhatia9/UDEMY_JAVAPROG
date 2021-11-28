public class AreaCalculator {
    public static double area(double radius){
        if(radius>=0.0){
            double area=Math.PI*radius*radius;
            System.out.println(area);
        }return 0;
    }

    public static double area(double x, double y){
        if(x>=0 && y >=0){
            double area = x*y;
            System.out.println(area);
        }return -1.0;
    }
}
