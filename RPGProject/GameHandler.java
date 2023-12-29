package RPGProject;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import RPGProject.GUI.BaseJFrame;
import RPGProject.GUI.BasePanel;
import RPGProject.GUI.ListButtons;
import RPGProject.GUI.MainFrame;

enum GameModes{
    PAUSED, PLAY
}

//Possibly could be static.
public class GameHandler {

    private GameModes playMode;
    private BaseJFrame mainFrame;
    private BasePanel background;
    private ListButtons forward;
    private ListButtons backward;

    private MainFrame frame;

    public GameHandler(){
        initialize();
    }

    private void initialize(){
        this.playMode = GameModes.PAUSED;
        this.frame = new MainFrame();

        /*
        mainFrame = new BaseJFrame();
        background = new BasePanel();
        forward = new ListButtons();
        backward = new ListButtons();

        mainFrame.addContainers(background.getPanel());
        background.addButton(forward.getButton());
        background.addButton(backward.getButton());
        */
    }

    public GameModes getPlayMode(){
        return this.playMode;
    }

}
