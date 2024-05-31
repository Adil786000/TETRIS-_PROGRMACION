public class Piece {
    private Shape shape;
    private int x;
    private int y;
    private Color color;

    public Piece(Shape shape, int x, int y, Color color) {
        this.shape = shape;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void moveDown() {
        y++;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public void rotate() {
        shape.rotate();
    }

    public boolean checkCollision() {
        // Verificar si la pieza choca con el tablero o con otras piezas
        return false;
    }

    public void draw() {
        // Dibujar la pieza en la pantalla
    }
}