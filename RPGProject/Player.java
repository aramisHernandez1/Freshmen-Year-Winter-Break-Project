package RPGProject;
public class Player{
    
    private String name;
    private int power = 1;
    private int maxHealth = 100;
    private int health = maxHealth;
    private double xp = 0d;
    private double maxXP = 100d;
    public int gold = 0;

    public Player(String player_name){
        this.name = player_name;
    }

    public void ChangeName(String new_name){
        this.name = new_name;
    }


    //#region Level and XP
    public void GainXP(double amount){
        this.xp += amount;

        if(this.xp >= this.maxXP){
            this.xp = 0d;
            this.power += 1d;
            this.maxXP = this.maxXP * ((double)this.power * 0.5d);
        }

    }

    public double GetXP(){
        return this.xp;
    }

    public int GetCurrentPower(){
        return this.power;
    }
    //#endregion



    //#region Health Methods
    public int GetMaxHealth(){
        return this.maxHealth;
    }

    public int GetCurrentHealth(){
        return this.health;
    }

    //#endregion
}
