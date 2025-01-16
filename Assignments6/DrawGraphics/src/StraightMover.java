import java.awt.Graphics;


public class StraightMover extends AbstractMover {
    /** Create a Bouncer that positions sprite at (startX, startY). */
    public StraightMover(int startX, int startY, Sprite sprite) {
        super(startX, startY, sprite);
    }

    @Override
    protected void specificMovementLogic() {
        // StraightMover There is no special movement logic, so this method can be left blank
    }
}
