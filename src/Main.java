public class Main {
    public static void main(String[] args) {
        String name = "Daniel";
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition(name, position);

        name = "Augusto";
        position = calculateHighScorePosition(1000);
        displayHighScorePosition(name, position);

        name = "Pedro";
        position = calculateHighScorePosition(500);
        displayHighScorePosition(name, position);

        name = "Carlos";
        position = calculateHighScorePosition(100);
        displayHighScorePosition(name, position);

        name = "Jon";
        position = calculateHighScorePosition(25);
        displayHighScorePosition(name, position);
    }

    private static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position "
                + position + " on the high score list");
    }

    private static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }
}
