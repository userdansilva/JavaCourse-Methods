public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value"); // Year must be grater than or equal to 0
            return;
        }

        int dayInMinutes = 60 * 24;
        int days = (int) (minutes / dayInMinutes);
        int remainingDays = days % 365;

        int years = days / 365;

        System.out.println(minutes + " min = "
                + years + " y and "
                + remainingDays + " d");
    }
}
