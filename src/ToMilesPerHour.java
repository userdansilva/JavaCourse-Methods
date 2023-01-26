public class ToMilesPerHour {
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(95.75);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long convertedMiles = toMilesPerHour(kilometersPerHour);

        System.out.println(kilometersPerHour + " km/h = "
                + convertedMiles + " mi/h");
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        double kilometerInMilesPerHour = 1.609;
        double convertedMiles = kilometersPerHour / kilometerInMilesPerHour;

        return Math.round(convertedMiles);
    }
 }
