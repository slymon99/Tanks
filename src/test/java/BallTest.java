import org.junit.Test;

import static org.junit.Assert.*;

public class BallTest {
    @Test
    public void move() throws Exception {
        Ball b = new Ball(1, 10, 20, -Math.PI);
        b.move();
    }

    @Test
    public void render() throws Exception {
    }

}