import java.awt.*;

public class Triangle implements Sprite {
    private int width;
    private int height;
    private Color color;

    public Triangle(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    @Override
    public void draw(Graphics surface, int x, int y) {
        surface.setColor(color);
        surface.fillOval(x, y, width, height);
        surface.setColor(Color.BLACK);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
