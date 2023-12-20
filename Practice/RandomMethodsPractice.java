package Practice;

import java.util.Random;

import javax.swing.JOptionPane;

//A dice rolling game.
public class RandomMethodsPractice {

    public static void main(String[] args) {
        Random random = new Random();

        //Generating oppent values
        int oppentDie1 = random.nextInt(6)+1;
        int oppentDie2 = random.nextInt(6)+1;

        //Confirm method returns a integer 0 = ok, 1 = no, 2 = cancel
        int confirm1 = JOptionPane.showConfirmDialog(null, "Would you like to roll your die?");


        if(confirm1 == 0){
            JOptionPane.showMessageDialog(null, "Rolling dice...");
            
            //Generate player numbers.
            int playerDie1 = random.nextInt(6)+1;
            int playerDie2 = random.nextInt(6)+1;
            
            //Display outcome
            JOptionPane.showMessageDialog(null, "You rolled " + playerDie1 + " and " + playerDie2);
            JOptionPane.showMessageDialog(null, "oppent rolled " + oppentDie1 + " and " + oppentDie2);

            //Win conditional
            if(oppentDie1+oppentDie2 > playerDie1+playerDie2){
                JOptionPane.showMessageDialog(null, "YOU LOSE.");
            }
            else{
                JOptionPane.showMessageDialog(null, "YOU WIN!");
            }
        }
    
        //Player didnt want to play.
        else{
            JOptionPane.showMessageDialog(null, "Game ended.");
        }

    }

}
