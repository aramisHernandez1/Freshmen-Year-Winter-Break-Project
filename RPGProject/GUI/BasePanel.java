package RPGProject.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

public class BasePanel {
    
    private JPanel panel;
    private Color panelColor = Color.gray;

    public BasePanel(){
        initialize();
    }

    private void initialize(){
        panel = new JPanel();
        this.panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
        this.panel.setBackground(this.panelColor);

    }

    public JPanel getPanel(){
        return this.panel;
    }

    public void ChangeColor(Color color){
        this.panel.setBackground(color);    
    }

    public void addComponent(JComponent container, FlowLayout location){
        this.panel.add(container, location);
    }

    public JButton addButton(JButton button){
        this.panel.add(button, new FlowLayout(FlowLayout.CENTER));
        return button;
    }
}
