package RPGProject.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.RenderingHints.Key;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class MainFrame{

    //Main frame class 
    private JFrame mainFrame;
    private JPanel panel; 

    private BorderLayout borderLayout;

    //Size is only len of 2.
    private int[] size = {800, 600};

    //JFrame is like the canvas.
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

        this.panel = new JPanel();
        this.panel.setBackground(Color.gray);

        this.mainFrame.add(panel, borderLayout.CENTER);

        show(true);
    }


    //Set different size
    public MainFrame(int[] size){
        initialize(size);

    }

    private void initialize(int[] size){
        this.size[0] = size[0];
        this.size[1] = size[1];

        this.mainFrame = new JFrame();
        this.mainFrame.setTitle("RPG Game");
        this.mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.mainFrame.setSize(size[0], size[1]);
        this.mainFrame.setLocationRelativeTo(null);

        borderLayout = new BorderLayout();

        this.mainFrame.setLayout(borderLayout);

        this.panel = new JPanel();
        this.panel.setBackground(Color.gray);

        this.mainFrame.add(panel, borderLayout.CENTER);

        show(true);
    }

    public void show(boolean visible){
        this.mainFrame.setVisible(true);
    }

    public JComponent getComponent(JComponent component){
        return component;
    }


    public JButton createButton(String text){
        JButton button = new JButton(text);
        button.setFocusable(false);   

        this.panel.add(button);

        return button;
    }

    public JButton createButton(String text, int menmonicKey){
        JButton button = new JButton(text);
        button.setFocusable(false);   
        button.setMnemonic(menmonicKey);

        this.panel.add(button);

        return button;
    }

}
