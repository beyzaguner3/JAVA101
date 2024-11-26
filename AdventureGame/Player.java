package Adventure;
import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int originalHealth;
    private int money;
    private String name;
    private String charName;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name){
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar(){
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Karakterler");
        System.out.println("------------------------------");
        for(GameChar x : charList){
            System.out.println("Karakter: " + x.getName() +
                    "\tID:" + x.getId() +
                    "\t\tHasar : " + x.getDamage() +
                    "\t\tSaglik :" + x.getHealth() +
                    "\t\tPara: " + x.getMoney());
        }
        System.out.println("--------------");
        System.out.print("Lütfen bir karakter seciniz : ");
        int selectChar = input.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        /* System.out.println("Karakter : " + this.getCharName() +
                ", " + "Hasar : " + this.getDamage() +
                ", " + "Saglik : " + this.getHealth() +
                ", " + "Para : " + this.getMoney()); */

    }


    public void initPlayer(GameChar x) {
       this.setDamage(x.getDamage());
       this.setHealth(x.getHealth());
       this.setOriginalHealth(x.getHealth());
       this.setMoney(x.getMoney());
       this.setCharName(x.getName());
    }

    public void printInfo(){
        System.out.println("Silah : " + this.getInventory().getWeapon().getName() +
                ", Zırh : " + this.getInventory().getArmor().getName() +
                ", Bloklama : " + this.getInventory().getArmor().getBlock() +
                ", Hasarınız : " + this.getDamage() +
                ", Sağlık : " + this.getHealth() +
                ", Para : " + this.getMoney());
    }
    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
