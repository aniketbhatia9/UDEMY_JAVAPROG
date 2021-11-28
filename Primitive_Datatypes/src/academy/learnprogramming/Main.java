package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        System.out.println("------------------------");

        byte MyMinByteValue = Byte.MIN_VALUE;
        byte MyMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Maximum Value " + MyMaxByteValue);
        System.out.println("Byte Minimum Value " + MyMinByteValue);

        System.out.println("------------------------");

        short MyMinShortValue = Short.MIN_VALUE;
        short MyMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Maximum Value " + MyMaxShortValue);
        System.out.println("Short Minimum Value "  + MyMinShortValue);

        System.out.println("------------------------");
       
        long myLongValue = 1000000000000000L;  //L is imp in the end as it tells the compiler that it is a long data type not the int data type

        long MyMinLongValue = Long.MIN_VALUE;
        long MyMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Maximum Value " + MyMaxLongValue);
        System.out.println("Long Minimum Value "  + MyMinLongValue);

        System.out.println("------------------------");

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue/2);

        byte myNewByteValue = (byte)(MyMinByteValue / 2);

        short myNewShortValue = (short)(MyMinShortValue / 2);

        System.out.println("------------------------");

        byte var1 = 100;

        short var2 = 10000;

        int var3 = 1000;

        long var4 = 50000 + 10*(var1+var2+var3);

        System.out.println(var4);





    }
}
