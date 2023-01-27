public class MehodOverloading {
    public static void main(String[] args) {
        System.out.println(calculateScore("Daniel", 500));
        System.out.println(calculateScore("Daniel", 500, 100));
    }

    public static int calculateScore(String name, int score) {
        System.out.println("Player " + name + " scored " + score + " points!");
        return score * 1000;
    }

    public static int calculateScore(String name, int score, int bonus) {
        System.out.println("Player " + name + " scored " + score + " points with bonus " + bonus);
        return (score * 1000) + bonus;
    }
}
