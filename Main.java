public class Main {
    public static void main(String[] args) {
        Level l1 = new Level(true, 10);
        Level l2 = new Level(true, 20);
        Level l3 = new Level(true, 30);
        Game game1 = new Game(l1, l2, l3, true);
        game1.play();
        System.out.println("Score (should be 180): " + game1.getScore());

        Level l4 = new Level(true, 10);
        Level l5 = new Level(false, 20);
        Level l6 = new Level(true, 30);
        Game game2 = new Game(l4, l5, l6, false);
        game2.play();
        System.out.println("Score (should be 10): " + game2.getScore());

        Game game3 = new Game(new Level(true, 10), new Level(true, 20), new Level(true, 30), false);
        System.out.println("Max score in 3 plays: " + game3.playManyTimes(3));
    }
}
