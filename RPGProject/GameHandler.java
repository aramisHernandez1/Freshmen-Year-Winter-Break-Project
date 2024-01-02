package RPGProject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
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
    private MovementHandler spaceHandler; 


    public GameHandler(){
        initialize();
    }

    private void initialize(){
        this.spaceHandler = new MovementHandler();

        //Pause menu
        this.playMode = GameModes.PAUSED;
        this.pauseFrame = new PauseFrame();

        JPanel pausePanel = this.pauseFrame.getPanel();
        JButton playButton = this.pauseFrame.createButton("Play", Color.white, Color.black);

        
        playButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
        pausePanel.add(playButton);

        //Game started
        
        playButton.addActionListener(new ActionListener() {
            @Override
            //Button Behavior and actual main menu for game
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
        JFrame frame = mainframe.getFrame();
        frame.add(rollbutton);

        

        rollbutton.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                Case curCase = spaceHandler.getCase();
                System.out.println(curCase);
            }
        });

    }

    public GameModes getPlayMode(){
        return this.playMode;
    }
}
