package LearningTutorials.JavaSwingTutorials;

import javax.swing.SwingUtilities;

public class Launcher {
    
    //Come back to.

    // All swing code has to run in the same thread. called event dispatch thread
    //Swing isnt thread safe.
    public static void main(String[] args) {
        //Needs a Runnable instance
        SwingUtilities.invokeLater(new Runnable() {

            //Overide run method only method Runnable has.
            @Override
            public void run(){
                //Create instance of MainWindow class.
                MainWindow main = new MainWindow();
                main.show();
            }
            
        });//Will ensure its all ran on the event dispatch thread.
    }

}
