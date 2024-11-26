package Adventure;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private boolean food;
    private boolean water;
    private boolean wood;
    private boolean randomItemFromMine;
    private boolean isMineCleared;

    public Inventory() {
        this.weapon = new Weapon( "Yumruk" , -1, 0, 0);
        this.armor = new Armor( -1 , "Paçavra", 0, 0);
        this.food = false;
        this.water = false;
        this.wood = false;
        this.randomItemFromMine = false;
        this.isMineCleared = false;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isWood() {
        return wood;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    public boolean isRandomItemFromMine() {
        return randomItemFromMine;
    }

    public void setRandomItemFromMine(boolean randomItemFromMine) {
        this.randomItemFromMine = randomItemFromMine;
    }
    public boolean isMineCleared() {
        return isMineCleared;
    }

    public void setMineCleared(boolean mineCleared) {
        isMineCleared = mineCleared;
    }

    public boolean checkAllItems(){
        boolean result = (isFood() && isWood() && isWater() && isMineCleared());
        if(result){
            System.out.println("TÜM ESYALAR TOPLANDI OYUNU KAZANDINIZ ");
            return true;
        }else {
            System.out.println("HENÜZ TÜM ESYALAR TOPLANMADI");
            return false;
        }
    }
}
