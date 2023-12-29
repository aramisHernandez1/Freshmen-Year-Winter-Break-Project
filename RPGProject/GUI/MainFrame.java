package RPGProject.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class MainFrame {

    private JFrame mainFrame;
    private JPanel panel; 

    private BorderLayout borderLayout;

    private int[] size = {800, 600};



    public MainFrame(){
        initialize();
    }
    
    private void initialize(){
        this.mainFrame = new JFrame();
        this.mainFrame.setTitle("RPG Game");
        this.mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.mainFrame.setSize(size[0], size[1]);
        this.mainFrame.setLocationRelativeTo(null);

        borderLayout = new BorderLayout();

        this.mainFrame.setLayout(borderLayout);
        this.mainFrame.setVisible(true);
        
        this.panel = new JPanel();
        this.panel.setBackground(Color.gray);


        this.mainFrame.add(panel);


    }

}
