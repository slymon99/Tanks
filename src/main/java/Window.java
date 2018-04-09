import javax.swing.*;

public class Window extends JFrame{
    public static final int focused = JComponent.WHEN_IN_FOCUSED_WINDOW;
    private static final String UP = "up";
    private static final String LEFT = "left";
    private static final String RIGHT = "right";
    private static final String DOWN = "down";
    private static final String SHOOT = "shoot";
    private static JLabel p1 = new JLabel();
    private static JLabel p2 = new JLabel();

    public static void main(String[] args) {
        new Window();
    }

    public Window(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 0, Game.WIDTH+15, Game.HEIGHT+45);

        World theWorld = new World();
        Game panel = new Game(theWorld);
        panel.setFocusable(true);
        panel.grabFocus();
        this.add(panel);
        this.setVisible(true);

        p1.getInputMap(focused).put(KeyStroke.getKeyStroke("UP"), UP);
        p1.getInputMap(focused).put(KeyStroke.getKeyStroke("DOWN"), DOWN);
        p1.getInputMap(focused).put(KeyStroke.getKeyStroke("LEFT"), LEFT);
        p1.getInputMap(focused).put(KeyStroke.getKeyStroke("RIGHT"), RIGHT);
        p1.getInputMap(focused).put(KeyStroke.getKeyStroke("M"), SHOOT);

        p2.getInputMap(focused).put(KeyStroke.getKeyStroke("W"), UP);
        p2.getInputMap(focused).put(KeyStroke.getKeyStroke("S"), DOWN);
        p2.getInputMap(focused).put(KeyStroke.getKeyStroke("A"), LEFT);
        p2.getInputMap(focused).put(KeyStroke.getKeyStroke("D"), RIGHT);
        p2.getInputMap(focused).put(KeyStroke.getKeyStroke("SPACE"), SHOOT);


        this.add(p1);
        this.add(p2);

    }
}
