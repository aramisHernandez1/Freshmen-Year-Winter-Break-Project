package RPGProject.GUI;

import javax.swing.JFrame;

public class BaseJFrame {
    
    private JFrame frame;
    private int[] size = {1000, 700};

    public BaseJFrame(){
        initialize();
    }

    private void initialize(){
        frame = new JFrame();
        this.frame.setTitle("RPG Game");
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setSize(this.size[0], this.size[1]);
        this.frame.setLocationRelativeTo(null);
        this.frame.setVisible(true);
    }

    public void changeSize(int[] size){
        this.size = size;
        this.frame.setSize(this.size[0], this.size[1]);
    }
}
