import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class World{
    
    ArrayList<Ball> balls;

    public World(){
        balls = new ArrayList<Ball>();
        for (int i = 0; i < 200; i++) {
            balls.add(new Ball(200,200,100+100*Math.random(), Math.random()*2*Math.PI));
        }



//        p1.getActionMap().put(UP, );

    }


    public void render(Graphics2D g2){
        for(Ball b: balls){
            b.render(g2);
        }

        g2.fillRect(850,850,50,50);
    }

    public void update(){
        for(Ball b: balls){
            b.move();
        }
    }
}
