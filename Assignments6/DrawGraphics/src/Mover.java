import java.awt.*;

public interface Mover {
    void setMovementVector(int xIncrement, int yIncrement);

    void draw(Graphics surface);
}