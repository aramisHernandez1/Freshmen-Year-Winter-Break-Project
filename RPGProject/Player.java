package RPGProject;
public class Player{
    
    private String name;
    private int power = 1;
    private int maxHealth = 100;
    private int health = maxHealth;
    private double xp = 0d;
    private double maxXP = 100d;

    public Player(String player_name){
        name = player_name;
    }

    public void ChangeName(String new_name){
        name = new_name;
    }


    //#region Level and XP
    public void GainXP(double amount){
        xp += amount;

        if(xp >= maxXP){
            xp = 0d;
            power += 1d;
            maxXP = maxXP * ((double)power * 0.5d);
        }

    }

    public double GetXP(){
        return xp;
    }

    public int GetCurrentPower(){
        return power;
    }
    //#endregion



    //#region Health Methods
    public int GetMaxHealth(){
        return maxHealth;
    }

    public int GetCurrentHealth(){
        return health;
    }

    //#endregion
}
