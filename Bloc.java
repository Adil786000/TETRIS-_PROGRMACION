public class Block extends Piece {
    public Block(int x, int y, Color color) {
        super(new Shape(), x, y, color);
    }

    public void draw() {
        System.out.print(color + " ");
    }
}