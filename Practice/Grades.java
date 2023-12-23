package Practice;

import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JOptionPane;

public class Grades {
    
    public static void main(String[] args) {
        int gradeQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of grades you would like to enter..."));
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to enter " + gradeQuantity + " Grades?");

        int[] grades = new int[gradeQuantity];
        int average = 0;

        if(confirm == 0){
            for(int i = 0; i< gradeQuantity; i++){
                grades[i] = Integer.parseInt(JOptionPane.showInputDialog("Please enter this Grade."));
                grades[i] = numberGuard(grades[i]);
                JOptionPane.showMessageDialog(null, "Entered:" + grades[i]);
                average += grades[i];
            }

            average /= grades.length;
            JOptionPane.showMessageDialog(null, "Your mean grade is:" + average);
        }



        JOptionPane.showMessageDialog(null, "The program has ended.");

    }

    public static int numberGuard(int number){
        number = Math.abs(number);
        if(number > 100){
            number = 100;
        }

        return number;
    }
}
