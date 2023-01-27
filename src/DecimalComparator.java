public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue) {
        int comparableFirstValue = (int) (firstValue * 1000);
        int comparableSecondValue = (int) (secondValue * 1000);

        return comparableFirstValue == comparableSecondValue;
    }
}
