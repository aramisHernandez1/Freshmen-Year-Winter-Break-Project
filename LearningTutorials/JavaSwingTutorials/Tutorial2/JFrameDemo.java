package LearningTutorials.JavaSwingTutorials.Tutorial2;

import javax.swing.SwingUtilities;;

public class JFrameDemo {
    
    //JFrame = the top level container in java swing.
    //Containers = Components that contain other visual components, (buttons, labels, and trees, etc.)


    //First way to create a JFrame, (eaisest but not best practice).
    public static void main(String[] args) {
        //Run this program on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            
            //2 is better because we dont have access to all internal to JFrame class.
            //2 is easily the best practice method less exposed = better.
            public void run(){
                JFrame1 frame1 = new JFrame1();
                JFrameTwo frameTwo = new JFrameTwo();
            }
        });
    }
}
