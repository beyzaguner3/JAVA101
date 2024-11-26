package Adventure;

public class Obstacle {
    private int id;
    private String name;
    private int damage;
    private int health;
    private int originalHealth;
    private int killWin;


    public Obstacle(int id, String name, int damage, int health, int killWin) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.originalHealth = health;
        this.killWin = killWin;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health < 0){
            health = 0;
        }
        this.health = health;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public int getKillWin() {
        return killWin;
    }

    public void setKillWin(int killWin) {
        this.killWin = killWin;
    }
}
