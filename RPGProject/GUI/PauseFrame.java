package RPGProject.GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.text.JTextComponent.KeyBinding;

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


        JButton playButton = createButton("Play");
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                pauseframe.dispose();
            }
        });

        playButton.setAlignmentX(JButton.CENTER_ALIGNMENT);

        this.pausePanel.add(playButton);
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

    private JButton createButton(String text){
        JButton button = new JButton(text);
        button.setMnemonic(KeyEvent.VK_ENTER);
        button.setFocusable(false);

        return button;
    }

    public void show(boolean visible){
        this.pauseframe.setVisible(visible);
    }
}
