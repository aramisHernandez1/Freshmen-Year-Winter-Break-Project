package RPGProject.GUI;

import javax.swing.*;

public class ListButtons{

    private JButton mainButton;

    public ListButtons(){
        initialize();
    }
    
    private void initialize(){
        mainButton = new JButton("?");
        this.mainButton.setBounds(200, 100, 200, 50);
    }

    public int count(int data, int max, int min, int count){
        if(data < max && data > min){
            data += count;
        }
        return data;
    }

    public JButton getButton(){
        return this.mainButton;
    }

    public void setToContainer(JComponent container){
        container.add(this.mainButton);
    }

}