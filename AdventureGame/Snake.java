package Adventure;

import java.util.Random;

public class Snake extends Obstacle{
    private String winItem;
    public Snake() {
        super(4, "YILAN", randomSnakeDamage(),2, 0);
        this.winItem = "";
    }
    public static int randomSnakeDamage(){
        Random r = new Random();
        return r.nextInt(4) + 3;
    }

    public void determineAward(){
        double random = Math.random() * 100;
        if(random <= 15){
            double random2 =  Math.random() * 100;
            if(random2 <= 20){
                setWinItem("Tüfek") ;
            }else if(random2 <= 50){
                setWinItem("Kılıç");
            }else {
                setWinItem("Tabanca");
            }
        }else if(random <= 30){
            double random3 =  Math.random() * 100;
            if(random3 <= 30){
                setWinItem("Ağır Zırh");
            }else if (random3 <= 50){
                setWinItem("Orta Zırh");
            } else {
                setWinItem("Hafif Zırh");
            }

        }else if (random <= 55){
            double random4 =  Math.random() * 100;
            if(random4 <= 20){
                this.setKillWin(10);
            }else if(random4 <= 50){
                this.setKillWin(5);
            }else{
                this.setKillWin(1);
            }
        }
    }

    public String getWinItem() {
        return winItem;
    }

    public void setWinItem(String winItem) {
        this.winItem = winItem;
    }
}
