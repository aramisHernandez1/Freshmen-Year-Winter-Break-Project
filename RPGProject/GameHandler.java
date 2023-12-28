package RPGProject;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import RPGProject.GUI.BaseJFrame;
import RPGProject.GUI.BasePanel;
import RPGProject.GUI.ListButtons;

enum GameModes{
    PAUSED, PLAY
}

//Possibly could be static.
public class GameHandler {

    private GameModes playMode;
    private BaseJFrame mainFrame;
    private BasePanel background;
    private ListButtons forward;

    public GameHandler(){
        initialize();
    }

    private void initialize(){
        this.playMode = GameModes.PAUSED;
        mainFrame = new BaseJFrame();
        background = new BasePanel();
        forward = new ListButtons();

        mainFrame.addContainers(background.getPanel());
        background.addButton(forward.getButton());

    }

    public GameModes getPlayMode(){
        return this.playMode;
    }

}
