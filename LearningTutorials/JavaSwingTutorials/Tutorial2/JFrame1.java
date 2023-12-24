package LearningTutorials.JavaSwingTutorials.Tutorial2;
import javax.swing.JFrame;

public class JFrame1 extends JFrame {

    //First Method to build a JFrame.
    public JFrame1(){
        initialize();
    }

    private void initialize(){
        setTitle("JFrame1");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);

    }
    
}
