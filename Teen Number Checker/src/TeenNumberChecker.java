public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c){

        if (a>=13 && a<=19 || b>=13 && b<=19 || c>=13 && c<=19 ){
            System.out.println(true);
            return true;
        }else
            System.out.println(false);
        return false;
    }
    public static boolean isTeen(int x){
        if(x >=13 && x <=19){
            System.out.println(true);
            return true;
        }else{
            System.out.println(false);
            return false;
        }

    }
}
