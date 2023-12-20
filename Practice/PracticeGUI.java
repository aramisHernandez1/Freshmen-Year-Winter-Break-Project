package Practice;

import javax.swing.JOptionPane;

public class PracticeGUI {

    public static void main(String[] args){
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter your A side"));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter your B side"));
        a *= a;
        b *= b;

        double c = Math.sqrt(a) + Math.sqrt(b);
        JOptionPane.showMessageDialog(null, "Your hypotenus is:"+c);


    }

    
}
