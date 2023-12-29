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

    private MainFrame frame;

    public GameHandler(){
        initialize();
    }

    private void initialize(){
        this.playMode = GameModes.PAUSED;
        this.frame = new MainFrame();


    }

    public GameModes getPlayMode(){
        return this.playMode;
    }

}
