import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game extends JPanel{

    private World theWorld;

    public Game(){
        theWorld = new World();

        Timer update = new Timer(1000 / 60, (ActionEvent e) -> {
            gameLoop();
        });

        update.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawString("test",300,300);
    }

    private void gameLoop(){
        repaint();
        theWorld.update();
    }

}
