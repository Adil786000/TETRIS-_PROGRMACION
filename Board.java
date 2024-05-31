public class Board {
    private Piece[][] grid;
    private int rows;
    private int cols;

    public Board() {
        rows = 20;
        cols = 10;
        grid = new Piece[rows][cols];
    }

    public void createBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = null;
            }
        }
    }

    public void update() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] != null) {
                    grid[i][j].update();
                }
            }
        }
    }

    public boolean checkCollision() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] != null) {
                    if (grid[i][j].checkCollision()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void draw() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] != null) {
                    grid[i][j].draw();
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}