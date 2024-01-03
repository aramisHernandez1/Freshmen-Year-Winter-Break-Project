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





public class GameHandler {


    private GameModes playMode;

    //Frames and Graphics
    private Mainframe mainframe;
    private PauseFrame pauseFrame;

    //TileHandler
    private MovementHandler spaceHandler; 

    //Action Commands
    private String playButtonCommand = "PLAY";
    private String rollButtonCommand = "ROLL";


    //Button Listener class for action commands
    class ButtonActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        String actionComand = e.getActionCommand();
        if(actionComand.equals(playButtonCommand)){
            start();
        }
        else if(actionComand.equals(rollButtonCommand)){
            Case curCase = spaceHandler.getCase();
            roll(curCase);
        }
        }
    }

    private ButtonActionListener actionListener = new ButtonActionListener();


    public GameHandler(){
        initialize();
    }

    //Sets up main pause menu and prepares the main console menu
    private void initialize(){
        this.spaceHandler = new MovementHandler();

        //Pause menu
        this.playMode = GameModes.PAUSED;
        this.pauseFrame = new PauseFrame();

        JPanel pausePanel = this.pauseFrame.getPanel();
        JButton playButton = this.pauseFrame.createButton("Play", Color.white, Color.black);

        
        playButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
        pausePanel.add(playButton);

        playButton.setActionCommand(playButtonCommand);
        playButton.addActionListener(actionListener);
    }

    public void mainGameplay(){
        JButton rollbutton = mainframe.createButton("Roll", Color.green, Color.gray);
        rollbutton.setActionCommand(rollButtonCommand);
        rollbutton.addActionListener(actionListener);

        JFrame frame = mainframe.getFrame();
        frame.add(rollbutton);
    }

    //Action command method
    private Case roll(Case tile){
        if(tile.equals(Case.FREESPACE)){
            int roll = spaceHandler.rollDice();
            spaceHandler.freeSpaceMove(roll);
            mainframe.print("You are on a free space. You rolled a " + roll + ". " + "You move " + roll + "Spaces.");
            spaceHandler.rollCase();
        }
        else if(tile.equals(Case.ENEMY)){
            int roll = spaceHandler.rollDice();
            mainframe.print("You encounter an enemy.");
            spaceHandler.rollCase();
        }
        else{
            int roll = spaceHandler.rollDice();
            mainframe.print("You found a chest!");
            spaceHandler.rollCase();
        }


        tile = spaceHandler.getCase();
        return tile;
    }


    //Pause menu action command method.
    private void start(){
        playMode = GameModes.PLAY;
        pauseFrame.exitWindow();
        mainframe = new Mainframe();
        mainGameplay();
    }

    public GameModes getPlayMode(){
        return this.playMode;
    }
}
