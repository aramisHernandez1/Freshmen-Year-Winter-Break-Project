package LearningTutorials.JavaSwingTutorials.Tutorial3;

import javax.swing.SwingUtilities;

import LearningTutorials.JavaSwingTutorials.Tutorial2.JFrameTwo;

//JPanel is a simple container class
//Space for a application to provide other components.
//Has own layout manager that is seperate

public class JPanelExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                JFrameTwo frame = new JFrameTwo();

            }
        });
    }
}
