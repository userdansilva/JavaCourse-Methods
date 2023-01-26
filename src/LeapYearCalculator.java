public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year) {
        boolean isValidYear = year >= 1 && year <= 9999;

        if (!isValidYear) {
            return false;
        }

        boolean isEvenlyDivisibleByFour = (year % 4) == 0;
        boolean isEvenlyDivisibleByOneHundred = (year % 100) == 0;
        boolean isEvenlyDivisibleByFourHundred = (year % 400) == 0;

        return (!isEvenlyDivisibleByOneHundred && isEvenlyDivisibleByFour)
                || (isEvenlyDivisibleByFourHundred && isEvenlyDivisibleByFour);
    }
}
