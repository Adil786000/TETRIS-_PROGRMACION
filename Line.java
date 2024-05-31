public class Line extends Block {
    public Line(int x, int y, Color color) {
        super(x, y, color);
    }

    public void draw() {
        System.out.print(color + " ");
        for (int i = x; i < x + cols; i++) {
            System.out.print(color + " ");
        }
        System.out.println();
    }
}