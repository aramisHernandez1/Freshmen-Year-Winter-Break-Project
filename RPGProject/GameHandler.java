package RPGProject;

import RPGProject.GUI.Mainframe;
import RPGProject.GUI.PauseFrame;

enum GameModes{
    PAUSED, PLAY
}

//Possibly could be static.
public class GameHandler {

    private GameModes playMode;
    private Mainframe mainframe;
    private PauseFrame pauseFrame;


    public GameHandler(){
        initialize();
    }

    private void initialize(){
        this.playMode = GameModes.PAUSED;
        this.pauseFrame = new PauseFrame();

    }

    public GameModes getPlayMode(){
        return this.playMode;
    }

}
