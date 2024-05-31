public class Level {
    private int currentLevel;
    private int maxLevel;

    public Level(int maxLevel) {
        currentLevel = 1;
        this.maxLevel = maxLevel;
    }

    public void increment() {
        currentLevel++;
    }

    public void reset() {
        currentLevel = 1;
    }
}