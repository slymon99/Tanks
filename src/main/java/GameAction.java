import javax.swing.*;
import java.awt.event.ActionEvent;

public class GameAction extends AbstractAction {
    String action;
    World theWorld;

    public GameAction(String action, World theWorld){
        this.action = action;
        this.theWorld = theWorld;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
