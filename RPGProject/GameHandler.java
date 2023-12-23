package RPGProject;

enum GameModes{
    PAUSED, PLAY
}

public class GameHandler {

    private GameModes mode;

    public GameHandler(){
        this.mode = GameModes.PAUSED;

    }

    public GameModes StartGame(){


        return this.mode = GameModes.PLAY;
    }

}
