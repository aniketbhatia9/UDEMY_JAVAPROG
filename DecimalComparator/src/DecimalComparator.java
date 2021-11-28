public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        System.out.println((int)(firstNumber*1000));
        if ((int) (firstNumber * 1000) == (int) (secondNumber * 1000)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("False");
            return false;
        }


    }
}