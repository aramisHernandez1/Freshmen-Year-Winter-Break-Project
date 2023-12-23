package RPGProject;

import javax.swing.JOptionPane;

enum GameModes{
    PAUSED, PLAY
}

//Possibly could be static.
public class GameHandler {

    private GameModes playMode;

    public GameHandler(){
        this.playMode = GameModes.PAUSED;

    }

    public GameModes StartGame(boolean firstStart){
        //Pause or first game start by the bool passed.
        String message;
        if(firstStart){
            message = "Press Yes to start game.";
        }
        else{
            message = "Press Yes to continue game.";
        }


        //Confirm window. 
        int confirm = JOptionPane.showConfirmDialog(null, message);
        if(confirm == 1){
            return this.playMode = GameModes.PLAY;
        }

        else{
            return this.playMode = GameModes.PAUSED;
        }
    }

    public Player CharacterCreation(){
        String name = JOptionPane.showInputDialog("What is your name?");
        Player character = new Player(name);

        return character;
    }


    public GameModes getPlayMode(){
        return this.playMode;
    }

}
