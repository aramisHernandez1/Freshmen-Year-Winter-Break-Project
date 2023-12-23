package LearningTutorials.JavaSwingTutorials;

import javax.swing.SwingUtilities;

public class Launcher {
    
    //Come back to.

    // All swing code has to run in the same thread. called event dispatch thread
    //Swing isnt thread safe.
    public static void main(String[] args) {
        SwingUtilities.invokeLater(null);//Will ensure its all ran on the event dispatch thread.
    }

}
