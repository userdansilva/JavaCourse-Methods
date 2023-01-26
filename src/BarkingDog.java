public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean barking, int hour) {
        boolean invalidHour = hour > 23 || hour < 0;

        if(invalidHour) {
            return false;
        }

        boolean isNight = hour < 8 || hour > 22;

        return isNight && barking;
    }
}
