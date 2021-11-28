public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");}
            else{
                int megaBytes = Math.round(kiloBytes/1024);
                int remainingkilobytes = (kiloBytes-(1024*megaBytes));
                System.out.println(kiloBytes + " KB " + " = " + megaBytes + " MB " + "and " +  remainingkilobytes + " KB " );
            }
        }
    }

