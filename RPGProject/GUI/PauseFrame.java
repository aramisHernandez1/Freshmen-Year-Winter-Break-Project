package RPGProject.GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class PauseFrame {

    private JFrame pauseframe;
    private JPanel pausePanel;

    public PauseFrame(){
        initialize();
    }

    private void initialize(){
        this.pauseframe = new JFrame();
        this.pauseframe.setTitle("RPG Game:Paused");
        this.pauseframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pauseframe.setSize(800, 400);
        this.pauseframe.setLocationRelativeTo(null); //Center
        this.pauseframe.isAlwaysOnTop();

        this.pausePanel = new JPanel();
        this.pausePanel.setBackground(Color.black);
        this.pausePanel.setLayout(new BoxLayout(this.pausePanel, BoxLayout.Y_AXIS));
        
        JLabel title = createLabel("Dugeon Crawler", 30, Color.GREEN);
        JLabel pauseLabel = createLabel("Please press play to start..", 14, Color.green);

        title.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        pauseLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        this.pausePanel.add(title);
        this.pausePanel.add(pauseLabel);



        this.pauseframe.add(pausePanel);

        show(true);
    }

    private JLabel createLabel(String text, int textSize, Color textColor){
        JLabel label = new JLabel(text);
        label.setForeground(textColor);
        label.setFont(new Font("Arial", Font.PLAIN, textSize));
        label.setBackground(Color.blue);


        return label;
    }

    public JButton createButton(String text, Color textColor, Color backgroundColor){
        JButton button = new JButton(text);
        button.setForeground(textColor);
        button.setBackground(backgroundColor);
        button.setMnemonic(KeyEvent.VK_ENTER);
        button.setFocusable(false);

        return button;
    }

    public  JPanel getPanel(){
        return pausePanel;
    } 

    public void exitWindow(){
        this.pauseframe.dispose();
    }

    public void show(boolean visible){
        this.pauseframe.setVisible(visible);
    }
}
