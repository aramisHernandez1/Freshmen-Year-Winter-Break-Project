package RPGProject.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class Mainframe {

    private JFrame frame;
    private JPanel mainPanel;

    public Mainframe(){
        initialize();
    }
    
    private void initialize(){
        this.frame = new JFrame();
        this.frame.setTitle("RPG Game");
        this.frame.setSize(800, 400);
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        this.mainPanel = new JPanel();
        this.mainPanel.setBackground(Color.black);
        this.mainPanel.setPreferredSize(new Dimension(100, 125));
        
        this.frame.add(mainPanel, BorderLayout.SOUTH);

        show(true);
    }

    public void show(boolean visible){
        this.frame.setVisible(visible);
    }

}
