package RPGProject.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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

    private int count = 0;

    private Color[] colors = {Color.red, Color.blue, Color.green};

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

        JButton button = createButton();

        this.panel.add(button);
        this.mainFrame.add(panel, borderLayout.CENTER);

        show(true);
    }

    public void show(boolean visible){
        this.mainFrame.setVisible(true);
    }

    private JButton createButton(){
        JButton button = new JButton(">");
        button.setFocusable(false);
        button.setMnemonic(KeyEvent.VK_RIGHT);
        button.setToolTipText("Click right arrow key to go foward.");

        //When button click do behavior
        buttonEvent(button);        

        return button;
    }

    private void buttonEvent(JButton button){
        button.addActionListener(new ActionListener() {
                    
            @Override
            public void actionPerformed(ActionEvent e){
                count = listCount(count, 1, 2, 0);
                panel.setBackground(colors[count]);

            }
        });

    }


    public int listCount(int data, int count, int max, int min){
        if(data < max && data > min){
            data += count;
        }
        return data;
    }

    public JComponent getComponent(JComponent component){
        return component;
    }
}
