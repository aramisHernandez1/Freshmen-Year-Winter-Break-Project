package LearningTutorials.BasicJavaTutorials;

//First ever GUI in java.

//Class import 
import javax.swing.JOptionPane;

public class FirstGUI {
    
    public static void main(String[] args){
        //Creates small dialog box that shows the argument. And gets the input entered from the user.
        //Note: This method only returns a string.
        String name = JOptionPane.showInputDialog("Enter your name");

        //This just shows the message as in a Dialog box.
        JOptionPane.showMessageDialog(null, "Hello " + name);

        //The string from the "showInputDialog" method needs to be converted to an int.
        //You can do this by,
        
        //You can just not enter the showInputDialog directly as the argument passed. 
        String ageInput = JOptionPane.showInputDialog("Enter your age");
        int age = Integer.parseInt(ageInput); //Converts any string to an integer. It seems.

        JOptionPane.showMessageDialog(null, "You are " + age + " old.");


        //Atempting with double
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height")); //Parse is used to convert data types
        JOptionPane.showMessageDialog(null, "You are " + height + " feet tall.");
    }

}
