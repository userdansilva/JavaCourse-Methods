public class MethodOverloaded {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5, 8));
    }

    public static double convertToCentimeters(int inches) {
        double inchInCentimeters = 2.54;
        return inches * inchInCentimeters;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int feetInInches = 12;
        int feetToInches = feet * feetInInches;
        int totalInches = feetToInches + inches;

        return convertToCentimeters(totalInches);
    }
}
