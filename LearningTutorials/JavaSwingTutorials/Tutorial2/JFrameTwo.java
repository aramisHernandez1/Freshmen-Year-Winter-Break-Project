package LearningTutorials.JavaSwingTutorials.Tutorial2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

//Second and best practice because it hides JFrame MEthods
public class JFrameTwo {
    
    private JFrame frame;
    JPanel panel;

    public JFrameTwo(){
        initialize();
    }

    private void initialize(){
        frame = new JFrame();
        this.frame.setTitle("JFrameTwo");
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setSize(500, 400);
        this.frame.setLocationRelativeTo(null);


        panel = new JPanel();
        this.panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        this.panel.setBackground(Color.RED);

        Button button = new Button("Button");
        this.panel.add(button);


        this.frame.add(panel, BorderLayout.CENTER);
        this.frame.setVisible(true);
    }

}
