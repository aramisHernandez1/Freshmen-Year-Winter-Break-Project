package LearningTutorials.JavaSwingTutorials.Tutorial2;

import javax.swing.SwingUtilities;;

public class JFrameDemo {
    
    //JFrame = the top level container in java swing.
    //Containers = Components that contain other visual components, (buttons, labels, and trees, etc.)


    //First way to create a JFrame, (eaisest but not best practice).
    public static void main(String[] args) {
        //Run this program on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            
            
            public void run(){
                JFrameTwo frameTwo = new JFrameTwo();
            }
        });
    }
}
