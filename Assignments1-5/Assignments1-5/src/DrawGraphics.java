import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> BouncingBoxs = new ArrayList<BouncingBox>();
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        for (int i = 0; i < 3; i ++) {
            BouncingBoxs.add(new BouncingBox(150, 100 + i * 30, Color.BLUE));
        }
        int[] dx = {0, 1, 0}, dy = {-1, 0, 1};
        for (int i = 0; i < BouncingBoxs.size(); i ++) {
            BouncingBoxs.get(i).setMovementVector(dx[i], dy[i]);
        }
    }
    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        for (int i = 0; i < 3; i ++) {
            BouncingBoxs.get(i).draw(surface);
        }
    }
}
