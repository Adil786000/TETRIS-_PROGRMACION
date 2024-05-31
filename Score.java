public class Score {
    private int currentScore;
    private int previousScore;

    public Score() {
        currentScore = 0;
        previousScore = 0;
    }

    public void increment() {
        currentScore += 10;
    }

    public void reset() {
        currentScore = 0;
    }
}