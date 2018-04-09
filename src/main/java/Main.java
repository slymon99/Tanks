import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Tank Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(0, 0, Game.WIDTH, Game.HEIGHT);

        Game panel = new Game();
        panel.setFocusable(true);
        panel.grabFocus();
        window.add(panel);

        window.setVisible(true);
    }
}
