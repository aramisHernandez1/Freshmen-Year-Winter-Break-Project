package RPGProject.GUI;

import java.awt.Color;

import javax.swing.JPanel;

public class BasePanel {
    
    private JPanel panel;
    private Color panelColor = Color.gray;

    public BasePanel(){
        initialize();
    }

    private void initialize(){
        panel = new JPanel();
        this.panel.setBounds(200, 200, 200, 200);
        this.panel.setBackground(this.panelColor);

    }

    public JPanel getPanel(){
        return this.panel;
    }

    public void ChangeColor(Color color){
        this.panel.setBackground(color);    
    }
}
