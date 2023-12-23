package LearningTutorials.JavaSwingTutorials;

import javax.swing.JFrame;

public class MainWindow {
    
    //JFrame = Top level container/window in Java Swing.
    private JFrame window;

    //Consturctor
    public MainWindow(){
        //Instance of JFrame
        window = new JFrame();
        window.setTitle("Hello World!");// Top name of window
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Makes it so when we click the top left X it actually closes the window instead of minimizing.
        window.setSize(800, 500);//800 x 500 pixels
        window.setLocationRelativeTo(null); //setting relative to null makes it cenentered on the screen.
    
    }

    public void show(){
        window.setVisible(true);
    }

}
