import java.awt.*;

public class Ball {
    private int x, y;
    private double speed; //in pixels per second / 60
    private double dx, dy;
    private double theta; //direction
    private int radius;

    public Ball(int x, int y, double speed, double theta){
        this.x = x;
        this.y = y;
        this.speed = speed/120;
        this.theta = theta;
        this.radius = 20;
    }

    public void move() {
        dx += Math.cos(theta) * speed;
        dy += Math.sin(theta) * speed;


        if (x + (int) dx < 0) {
            x = 0;
            dx = 0;
            theta = -theta + Math.PI;
        }
        else if (x + (int) (dx) + this.radius * 2 > Game.WIDTH) {
            x = Game.WIDTH - this.radius * 2;
            dx = 0;
            theta = -theta + Math.PI;
        }
        else if (Math.abs(dx) > 1) {
            x += (int) dx;
            dx -= (int) dx;
        }


        if (y + (int) dy < 0) {
            y = 0;
            dy = 0;
            theta = -theta;
        }
        if (y + (int) dy + this.radius * 2 > Game.HEIGHT) {
            y = Game.HEIGHT - this.radius * 2;
            dy = 0;
            theta = -theta;
        }
        if (Math.abs(dy) > 1) {
            y += (int) dy;
            dy -= (int) dy;
        }

    }

    public void render(Graphics2D g2){
        g2.fillOval(x, y, this.radius*2, this.radius*2);
    }
}
