package RPGProject.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;


public class BaseJFrame {
    
    private JFrame frame;
    private int[] size = {1000, 700};
    private String title = "RPG Game";

    public BaseJFrame(){
        initialize();
    }

    public BaseJFrame(String title){
        initialize(title);
    }

    private void initialize(){
        frame = new JFrame();
        this.frame.setTitle("RPG Game");
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setSize(this.size[0], this.size[1]);
        this.frame.setLocationRelativeTo(null);
        this.frame.setVisible(true);


    }

    //Overloaded method if we want a different title
    private void initialize(String title){
        this.title = title;

        frame = new JFrame();
        this.frame.setTitle(title);
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setSize(this.size[0], this.size[1]);
        this.frame.setLocationRelativeTo(null);
        this.frame.setVisible(true);
    }


    public void changeSize(int[] size){
        this.size = size;
        this.frame.setSize(this.size[0], this.size[1]);
    }

    public void addContainers(JComponent container){
        this.frame.add(container, BorderLayout.CENTER);
    }
}
