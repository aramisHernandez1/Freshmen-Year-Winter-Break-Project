package LearningTutorials.JavaSwingTutorials.Tutorial2;

import javax.swing.JFrame;

//Second and best practice because it hides JFrame MEthods
public class JFrameTwo {
    
    private JFrame frame;

    public JFrameTwo(){
        initialize();
    }

    private void initialize(){
        frame = new JFrame();
        this.frame.setTitle("JFrameTwo");
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setSize(500, 400);
        this.frame.setLocationRelativeTo(null);
        this.frame.setVisible(true);
    }

}
