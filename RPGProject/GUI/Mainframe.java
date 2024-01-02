package RPGProject.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class Mainframe {

    private JFrame frame;
    private JPanel mainPanel;
    private JLabel consoleText;

    public Mainframe(){
        initialize();
    }
    
    private void initialize(){
        this.frame = new JFrame();
        this.frame.setTitle("RPG Game");
        this.frame.setSize(800, 400);
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setLocationRelativeTo(null);

        JPanel background = new JPanel();
        background.setBackground(Color.gray);
        this.frame.add(background, BorderLayout.CENTER);


        this.mainPanel = new JPanel();
        this.mainPanel.setBackground(Color.black);
        this.mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.mainPanel.setPreferredSize(new Dimension(100, 125));
        
        this.consoleText = new JLabel();
        this.consoleText.setForeground(Color.green);
        print("Game started press Roll to start your adventure.");

        this.mainPanel.add(consoleText);
        this.frame.add(mainPanel, BorderLayout.SOUTH);

        show(true);
    }

    //Common method to print text in the game.
    public void print(String text){
        consoleText.setText("System: " + text);
    }

    public JLabel getConsole(){
        return this.consoleText;
    }

    
    public JButton createButton(String text, Color textColor, Color backgroundColor){
        JButton button = new JButton(text);
        button.setForeground(textColor);
        button.setBackground(backgroundColor);
        button.setFocusable(false);

        return button;
    }

    public JPanel getConsolePanel(){
        return this.mainPanel;
    }

    public JFrame getFrame(){
        return this.frame;
    }

    public void show(boolean visible){
        this.frame.setVisible(visible);
    }

}
