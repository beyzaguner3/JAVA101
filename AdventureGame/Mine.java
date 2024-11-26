package Adventure;

public class Mine extends BattleLoc{
    public Mine(Player player){
        super(player,"Maden", new Snake(), "Para, Silah veya Zırh" , 5 );
    }
    @Override
    public boolean onLocation() {
        if (this.getPlayer().getInventory().isMineCleared()) {
            System.out.println("Maden bölgesi zaten tamamlandı. Buraya tekrar giriş yapılamaz.");
            return true;
        }

        System.out.println("Madendesiniz. Yılanlarla savaşıyorsunuz!");
        boolean result = combat(randomObstacleNumber());
        if (result) {
            System.out.println("Tüm yılanları öldürdünüz. Maden bölgesini tamamladınız!");
            this.getPlayer().getInventory().setMineCleared(true); // Bölge tamamlandı olarak işaretleniyor
        }
        return result;
    }
}
