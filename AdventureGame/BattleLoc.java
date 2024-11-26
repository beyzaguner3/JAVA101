package Adventure;

import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }
    @Override
    public boolean onLocation(){
        int obsNumber = this.randomObstacleNumber();
        System.out.println("Oldugunuz konum : " + getName());
        System.out.println("Dikkatli olmalisin !! Burada " + obsNumber + " tane " + getObstacle().getName() + " yasiyor");
        System.out.print("<S>avas veya <K>ac : ");
        String selectCase = input.nextLine().toUpperCase();
        if(selectCase.equals("S") && combat(obsNumber)) {
            System.out.println("SAVAŞ BAŞLIYOR");
                System.out.println(this.getName() + "' deki tüm canavarlari öldürdün");
                return true;
        }
        if(this.getPlayer().getHealth() <= 0) {
            System.out.println("Öldünüz !!");
            return false;
        }
        return true;
    }
    public boolean combat(int obsNumber) {
        for(int i = 1 ; i <= obsNumber ; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
            playerStats();
            obstacleStats(i);
            double randomNumber2 = Math.random() * 100;
            System.out.println(randomNumber2);
            if(randomNumber2 <= 50) {
                while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                    System.out.print("<S>avas veya <K>ac :");
                    String selectCombat = input.nextLine().toUpperCase();
                    if (selectCombat.equals("S")) {
                        System.out.println("ATAK YAPILDI !!");
                        getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();
                        if (this.getObstacle().getHealth() > 0) {
                            System.out.println("SALDIRIYA UGRADIN !!");
                            int obstacleDamegeWithBlock = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                            if (obstacleDamegeWithBlock < 0) {
                                obstacleDamegeWithBlock = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamegeWithBlock);
                            afterHit();
                        }
                    } else {
                        return false;
                    }
                }
            }else {
                while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                    System.out.print("<S>avas veya <K>ac :");
                    String selectCombat = input.nextLine().toUpperCase();
                    if (selectCombat.equals("S")) {
                        System.out.println("SALDIRIYA UGRADIN !!");
                        int obstacleDamegeWithBlock = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (obstacleDamegeWithBlock < 0) {
                            obstacleDamegeWithBlock = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamegeWithBlock);
                        afterHit();
                        if (this.getPlayer().getHealth() > 0) {
                            System.out.println("ATAK YAPILDI !!");
                            getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                            afterHit();
                        }
                    } else {
                        return false;
                    }
                }

            }
            if(this.getObstacle().getHealth() < this.getPlayer().getHealth()){
                System.out.println("CANAVARI ÖLDÜRDÜNÜZ !");
                System.out.println(this.getObstacle().getKillWin() + " PARA KAZANDINIZ ");
                this.getPlayer().setMoney(getPlayer().getMoney() + getObstacle().getKillWin());
                System.out.println("Paraniz : " + getPlayer().getMoney());
                if(getName().equals("Güvenli Ev")){
                    getPlayer().getInventory().checkAllItems();
                }
                if(getName().equals("Mağara")){
                    getPlayer().getInventory().setFood(true);
                } else if (getName().equals("Orman")) {
                    getPlayer().getInventory().setWood(true);
                } else if (getName().equals("Nehir")) {
                    getPlayer().getInventory().setWater(true);
                }else if(getName().equals("Maden")){
                    getPlayer().getInventory().isRandomItemFromMine();
                }
            }else {
                return false;
            }
        }
        
        return true;
    }
    public void afterHit(){
        System.out.println("Kalan Can : " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Cani : " + this.getObstacle().getHealth());
        System.out.println("-----------------");
    }

    public void playerStats() {
        System.out.println("Oyuncu Degerleri : ");
        System.out.println("-------------------");
        System.out.println("Saglik : " + this.getPlayer().getHealth());
        System.out.println("Silah : " + getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Zirh : " + getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para : " + this.getPlayer().getMoney());
        System.out.println();

    }
    public void obstacleStats(int i) {
        System.out.println(i + "." + this.getObstacle().getName());
        System.out.println("-------------------");
        System.out.println("Saglik : " + this.getObstacle().getHealth());
        System.out.println("Hasar : " + this.getObstacle().getDamage());
        System.out.println("Öldürdügünde kazanacagin para : " + this.getObstacle().getKillWin());
    }

    public int randomObstacleNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1; //mesela maxObstacle = 3 ise 0,1,2 sayilari üretilir o yüzden 1 ekliyoruz.
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
