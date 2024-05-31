public class Game {
    private Board board;
    private int score;
    private int level;

    public Game() {
        board = new Board();
        score = 0;
        level = 1;
    }

    public void initialize() {
        board.createBoard();
        score = 0;
        level = 1;
    }

    public void update() {
        board.update();
        if (board.checkCollision()) {
            score += 10;
            level++;
        }
    }

    public void draw() {
        board.draw();
    }

    public boolean checkCollision() {
        return board.checkCollision();
    }
}