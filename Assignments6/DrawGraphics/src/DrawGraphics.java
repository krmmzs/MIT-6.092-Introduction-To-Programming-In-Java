import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Objects;

public class DrawGraphics {
    ArrayList<Mover> movers = new ArrayList<Mover>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle[] rectangles = {
            new Rectangle(15, 20, Color.RED),
            new Rectangle(15, 20, Color.YELLOW)
        };
        Triangle[] triangles = {
            new Triangle(20, 20, Color.BLUE),
            new Triangle(20, 20, Color.GREEN)
        };
        movers.add(new Bouncer(50, 150, rectangles[0]));
        movers.add(new Bouncer(200, 250, triangles[0]));
        movers.add(new StraightMover(100, 200, rectangles[1]));
        movers.add(new StraightMover(150, 200, triangles[1]));
        for (int i = 0; i < movers.size(); i ++) {
            movers.get(i).setMovementVector(2, 1);
        }
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (int i = 0; i < movers.size(); i ++) {
            movers.get(i).draw(surface);
        }
    }
}