package RPGProject.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

import RPGProject.MovementHandler;

public class EnemyWindow {
    
    private JFrame frame;
    private ActionListener actionListener;

    private String fightCommand = "FIGHT";
    private String fleeCommand = "FLEE";

    public EnemyWindow(MovementHandler handler){
        initialize(handler);
    }


    private void initialize(MovementHandler handler){
        this.frame = new JFrame();
        initActionListern(handler);


        this.frame.setSize(300, 300);
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.setBackground(Color.black);

        JButton fighButton = new JButton("Fight");
        fighButton.setPreferredSize(new Dimension(100, 200));
        fighButton.setBackground(Color.black);
        fighButton.setForeground(Color.red);
        fighButton.setFocusable(false);
        fighButton.setActionCommand(fightCommand);
        fighButton.addActionListener(actionListener);

        JButton fleeButton = new JButton("Flee");
        fleeButton.setPreferredSize(new Dimension(100, 200));
        fleeButton.setBackground(Color.black);
        fleeButton.setForeground(Color.green);
        fleeButton.setFocusable(false);
        fleeButton.setActionCommand(fleeCommand);
        fleeButton.addActionListener(actionListener);

        panel.add(fighButton);
        panel.add(fleeButton);
        
        this.frame.add(panel);
        show(true);
    }

    private void initActionListern(MovementHandler handler){
        this.actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                if(command.equals(fleeCommand)){
                    fleeAction(0, handler);
                }
                else if(command.equals(fightCommand)){

                }

            }
        };
    }

    //50/50 chance to flee
    private void fleeAction(int playerGold, MovementHandler handler){
        Random random = new Random();
        int num = random.nextInt(1);
        if(num == 0){
            playerGold -= random.nextInt(4);
            handler.rollCase();
        }
        else{
            //Pop enemy window
        }

    }

    public void show(boolean visible){
        this.frame.setVisible(visible);
    }
}
