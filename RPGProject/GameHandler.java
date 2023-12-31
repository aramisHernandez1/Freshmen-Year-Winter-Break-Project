package RPGProject;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

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

        JPanel pausePanel = this.pauseFrame.getPanel();
        JButton playButton = this.pauseFrame.createButton("Play", Color.white, Color.black);

        playButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
        pausePanel.add(playButton);
        
        playButton.addActionListener(new ActionListener() {
            @Override
            //Button Behavior
            public void actionPerformed(ActionEvent e){
                playMode = GameModes.PLAY;
                pauseFrame.exitWindow();
                mainframe = new Mainframe();
                gameStart();
            }
            
        });
    }

    public void gameStart(){
        JButton rollbutton = mainframe.createButton("Roll", Color.green, Color.blue);
        JPanel panel = mainframe.getConsolePanel();
        panel.add(rollbutton);

    }

    public GameModes getPlayMode(){
        return this.playMode;
    }

}
