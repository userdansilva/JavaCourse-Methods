public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature < 25) {
            return false;
        }

        return summer && (temperature <= 45 )
                || !summer && (temperature <= 35);
    }
}
