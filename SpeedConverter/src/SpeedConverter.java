public class SpeedConverter {
        public static long toMilesPerHour(double kilometersPerHour){
            // kilometersPerHour = 5;
            if (kilometersPerHour < 0) {
                return -1;
            }else if (kilometersPerHour > 0){
                long MilesPerHour = Math.round(kilometersPerHour/1.609);
                return MilesPerHour;

            }
            return 0;

        }



        public static void printConversion(double kilometersPerHour){
            if(kilometersPerHour < 0){
                System.out.println("Invalid Value");
            }else{
                long MilesPerHour = toMilesPerHour(kilometersPerHour);
                System.out.println(kilometersPerHour + " km/h" + " = " + MilesPerHour + " mi/h");
            }


        }

    }


