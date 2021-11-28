package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1+2; //1 + 2 = 3
        System.out.println(result);
        result = result -1;  // 2
        System.out.println(result);

        result = result * 10;   //20
        System.out.println(result);

        result = result /5;   // 4
        System.out.println(result);


        result = result % 3;  // the remainder of (4 % 3) is 1
        System.out.println(result);

        // result = result +1;
        result ++;   // 1+1=2
        System.out.println(result);

        result--;  // 2-1=1
        System.out.println(result);

        // result = result +2
        result += 2;
        System.out.println(result);

        // result = result *10
        result *= 10;
        System.out.println(result);

        // result = result /3
        result /= 3;
        System.out.println(result);

        // result = result -2
        result -=2;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topscore = 80;
        if (topscore >= 100) {
            System.out.println("You got the high score ");
        }

        int secondtopscore = 60;
        if ((topscore > secondtopscore) && (topscore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topscore > 90 ) || (secondtopscore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newvalue = 50 ;
        if (newvalue == 50){
            System.out.println("This is true");
        }

        boolean iscar = false;
        if (!iscar){
            System.out.println("This is not supposed to happen");
        }

        boolean wascar = iscar ? true : false;
        if (!wascar){
            System.out.println("was car is true");
        }

        System.out.println("---------------------Challenge-------------------------------");


        double var1 = 20.00;
        double var2 = 80.00;
        double sum  = (var1 + var2) * 100;
        System.out.println(sum);
        double rem  = (sum%40.00);
        System.out.println(rem);
        boolean var3=true;

        if (rem == 0){
            var3 = true;
        }

        if (rem !=0 ){
            var3 = false;
            System.out.println("Got some remainder");

        }

        System.out.println(var3);



    }
}
