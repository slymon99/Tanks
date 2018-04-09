import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game extends JPanel{

    public static int WIDTH = 900;
    public static int HEIGHT = 900;


    private World theWorld;

    public Game(){
        theWorld = new World();

        Timer update = new Timer(1000/120, (ActionEvent e) -> {
            gameLoop();
        });

        update.start();
        this.startRendering();
    }

    public void startRendering() {
        Thread t = new Thread() {
            public void run() {
                while (true) {
                    repaint();
//                    try {
//                        Thread.sleep(1);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
            }

        };
        t.setDaemon(true);
        t.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        theWorld.render(g2);
    }



    private void gameLoop(){
        theWorld.update();
    }

}
