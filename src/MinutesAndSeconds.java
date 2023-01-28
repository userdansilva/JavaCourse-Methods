public class MinutesAndSeconds {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945)); // 01h 05m 45s
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Seconds must be greater than or equal to 0";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        boolean isValidMinutes = minutes >= 0;
        boolean isValidSeconds = seconds >= 0 && seconds <= 59;

        if (!isValidMinutes) {
            return "Minutes must be greater than or equal to 0";
        }

        if (!isValidSeconds) {
            return "Seconds must be greater than or equal to 0, and less than or equal to 59";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String formattedHours = appendZero(hours);
        String formattedMinutes = appendZero(remainingMinutes);
        String formattedSeconds = appendZero(seconds);

        return formattedHours + "h "
                + formattedMinutes + "m "
                + formattedSeconds + "s";

    }

    public static String appendZero(int number) {
        boolean shouldAppendZero = number <= 9;

        if (shouldAppendZero) {
            return "0" + number;
        }

        return number + "";

    }
}
