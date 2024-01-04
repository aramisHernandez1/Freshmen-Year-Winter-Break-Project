package RPGProject;

import java.util.Random;

import RPGProject.GUI.EnemyWindow;

enum Case{
    ENEMY, CHEST, FREESPACE

}

public class MovementHandler {
    private Case currrentCase;
    private int tileCount = 0;


    public MovementHandler(){
        initialize();
    }

    private void initialize(){
        currrentCase = Case.FREESPACE;
    }

    public void rollCase(){
        Random random = new Random();
        int randomNum = random.nextInt(3)+1;
        
        switch (randomNum) {
            case 1:currrentCase = Case.ENEMY;
                break;
            case 2:currrentCase = Case.CHEST;
                break;
            default:currrentCase = Case.FREESPACE;
                break;
        }
    }

    public void EnemyEncount(){
        EnemyWindow choice = new EnemyWindow(this);

    }

    public void freeSpaceMove(int space){        
        this.tileCount += space;
    }

    public Case getCase(){
        return this.currrentCase;
    }

    public int getCount(){
        return this.tileCount;
    }

    public int rollDice(){
        Random random = new Random();
        return random.nextInt(6)+1;
    }
    
}
