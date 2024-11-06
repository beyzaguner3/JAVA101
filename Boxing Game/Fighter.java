public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int defense;

    Fighter(String name, int damage, int health, int weight, int defense){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if(defense >= 0 && defense <= 100){
            this.defense = defense;////Yani gelen hasari karsilayabilme orani
        } else {
            this.defense = 0;
        }
    }
    int hit(Fighter enemy){
        System.out.println(this.name + " -> " + enemy.name + " " + this.damage + " kadar hasar verdi.");
        if(enemy.isDefense()){
            System.out.println(enemy.name + " gelen hasari engelledi.");
            return enemy.health;
        }
        if(enemy.health - this.damage < 0){
            return 0;
        }
        return enemy.health - this.damage;
    }
    boolean isDefense (){
        double randomNumber = Math.random() * 100; // 0.0 ile 100 arasinda random bir sayi üretir.
        return randomNumber <= this.defense;
    }


}
