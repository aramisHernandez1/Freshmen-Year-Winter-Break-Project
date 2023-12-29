package RPGProject.GUI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class MainFrame {

    private JFrame mainFrame;
    private JPanel north;
    private JPanel center;
    private JPanel south;
    private JPanel east;
    private JPanel west;

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

        initPanels();


    }


    private void initPanels(){
        center = new JPanel();
        center.setBackground(Color.green);

        north = new JPanel();
        north.setBackground(Color.blue);

        south = new JPanel();
        south.setBackground(Color.red);

        east = new JPanel();
        east.setBackground(Color.orange);

        west = new JPanel();
        west.setBackground(Color.gray);

        addPanels();
    }

    private void addPanels(){
        this.mainFrame.add(center, borderLayout.CENTER);
        this.mainFrame.add(north, borderLayout.NORTH);
        this.mainFrame.add(south, borderLayout.SOUTH);
        this.mainFrame.add(east, borderLayout.EAST);
        this.mainFrame.add(west, borderLayout.WEST);
    }

}
