public class Level {
    private boolean goalReached;
    private int points;

    public Level(boolean goalReached, int points) {
        this.goalReached = goalReached;
        this.points = points;
    }

    public boolean goalReached() {
        return goalReached;
    }

    public int getPoints() {
        return points;
    }

    public void setGoalReached(boolean reached) {
        goalReached = reached;
    }

    public void setPoints(int pts) {
        points = pts;
    }
}
