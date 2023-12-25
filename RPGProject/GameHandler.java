package RPGProject;

import java.awt.Color;

import javax.swing.JOptionPane;

import RPGProject.GUI.BaseJFrame;
import RPGProject.GUI.BasePanel;

enum GameModes{
    PAUSED, PLAY
}

//Possibly could be static.
public class GameHandler {

    private GameModes playMode;
    private BaseJFrame mainFrame;
    private BasePanel background;

    public GameHandler(){
        initialize();
    }

    private void initialize(){
        this.playMode = GameModes.PAUSED;
        mainFrame = new BaseJFrame();
        background = new BasePanel();

        mainFrame.addContainers(background.getPanel());
    }

    public GameModes getPlayMode(){
        return this.playMode;
    }

}
