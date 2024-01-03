package RPGProject;
public class BaseEnemy {

    private int maxHealth = 30;
    private int power = 2;
    public int health = maxHealth;
    private int attackPower = 2 * power;


    public void takeDamage(int damage){
        this.health -= damage;
    }

    public int getAttackPower(){
        return this.attackPower;
    }

}
