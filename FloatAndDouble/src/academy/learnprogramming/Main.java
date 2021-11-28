package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

       float myMinFloatValue = Float.MIN_VALUE;
       float myMaxFloatValue = Float.MAX_VALUE;
       System.out.println("Float minimum value = " + myMinFloatValue);
       System.out.println("Double maximum value = "+ myMaxFloatValue);

       int myIntValue = 5 /3 ;
       float myFloatValue = 5f /3f;
       double myDoubleValue = 5d / 3d;
       System.out.println("My Int Value = " + myIntValue);
       System.out.println("My Float Value = " + myFloatValue);
       System.out.println("My Double Value = " + myDoubleValue);

        System.out.println("----------Challenge--------------");
        double pound = 500;
        double kilogram = pound * 0.45359237;
        System.out.println(kilogram + " kg");

    }
}
