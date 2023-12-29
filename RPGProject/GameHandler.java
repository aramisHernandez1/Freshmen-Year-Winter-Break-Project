package RPGProject;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JOptionPane;

enum GameModes{
    PAUSED, PLAY
}

//Possibly could be static.
public class GameHandler {

    private GameModes playMode;


    public GameHandler(){
        initialize();
    }

    private void initialize(){
        this.playMode = GameModes.PAUSED;



    }

    public GameModes getPlayMode(){
        return this.playMode;
    }

}
