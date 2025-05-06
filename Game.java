public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean bonus;

    public Game(Level one, Level two, Level three, boolean isBonus) {
        levelOne = one;
        levelTwo = two;
        levelThree = three;
        bonus = isBonus;
    }

    public boolean isBonus() {
        return bonus;
    }

    public void play() {
    }

    public int getScore() {
        int score = 0;

        if (levelOne.goalReached()) {
            score += levelOne.getPoints();
            if (levelTwo.goalReached()) {
                score += levelTwo.getPoints();
                if (levelThree.goalReached()) {
                    score += levelThree.getPoints();
                }
            }
        }

        if (isBonus()) {
            score *= 3;
        }

        return score;
    }

    public int playManyTimes(int num) {
        int maxScore = 0;

        for (int i = 0; i < num; i++) {
            play();
            int score = getScore();
            if (score > maxScore) {
                maxScore = score;
            }
        }

        return maxScore;
    }
}
