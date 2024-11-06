public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    void run() {
        if (isCheck()) {
            boolean f1Starts = whoStarts();
                if(f1Starts) {
                    while (this.f1.health > 0 && this.f2.health > 0) {
                        System.out.println("-----------YENI ROUND----------");
                        this.f2.health = this.f1.hit(this.f2);
                        System.out.println(this.f2.name + " 'nin kalan cani : " + this.f2.health);
                        if (isWin()) {
                            break;
                        }
                        this.f1.health = this.f2.hit(this.f1);
                        System.out.println(this.f1.name + " 'nin kalan cani : " + this.f1.health);
                        if (isWin()) {
                            break;
                        }
                    }
                }else{
                    while (this.f1.health > 0 && this.f2.health > 0) {
                        System.out.println("-----------YENI ROUND----------");
                        this.f1.health = this.f2.hit(this.f1);
                        System.out.println(this.f1.name + " 'nin kalan cani : " + this.f1.health);
                        if (isWin()) {
                            break;
                        }
                        this.f2.health = this.f1.hit(this.f2);
                        System.out.println(this.f2.name + " 'nin kalan cani : " + this.f2.health);
                        if (isWin()) {
                            break;
                        }
                    }
                }
            } else {
            System.out.println("Sporcularin sikletleri uymuyor!");
        }
    }

    boolean isCheck() {
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }

    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println(this.f2.name + " kazandi !");
            return true;
        }
        if(this.f2.health == 0){
            System.out.println(this.f1.name + " kazandi !");
            return true;
        }
        return false;
    }
    boolean whoStarts(){
        double randomNumber2 = Math.random() * 100;
        return randomNumber2 >= 50;
    }

}

