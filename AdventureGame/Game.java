package Adventure;
import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Macera Oyununa Hosgeldiniz !");
        System.out.println("Lütfen bir kullanici adi giriniz : ");
        //String playerName = input.nextLine();
        Player player = new Player("Beyza");
        System.out.println("Sayin " + player.getName() + " bu karanlik ve sisli adaya hosgeldin !");
        System.out.println("Lütfen bir karakter seciniz : ");
        player.selectChar();

        boolean isWin = false;
        Location location = null;
        while (!isWin) {
            player.printInfo();
            System.out.println();
            System.out.println("##########Bölgeler#############");
            System.out.println();
            System.out.println("1- Güvenli Ev");
            System.out.println("2- Tool Store --> Silah veya Zirh satin alabilirsiniz.");
            System.out.println("3- Mağara--> Ödül <Yemek> ,  Dikkatli ol zombiler yasiyor");
            System.out.println("4- Orman --> Ödül <Odun> , Dikkatli ol burada vampirler yasiyor");
            System.out.println("5- Nehir --> Ödül <Su> ,  Dikkatli ol burada ayilar yasiyor");
            System.out.println("6- Maden --> Ödül <Para, Silah veya Zırh> , Dikkatli ol burada yilanlar yasiyor");
            System.out.println("0- Çıkış yap --> Oyunu sonlandir");

            System.out.print("Lütfen gitmek istediginiz bölgeyi seciniz : ");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 0:
                    System.out.println("Oyundan Cikis Yapildi.");
                    return; // Oyunu tamamen sonlandır
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    if (player.getInventory().isFood()) {
                        System.out.println("Mağara ödülü zaten alındı, buraya tekrar giriş yapılamaz!");
                        continue;
                    } else {
                        location = new Cave(player);
                    }
                    break;
                case 4:
                    if (player.getInventory().isWood()) {
                        System.out.println("Orman ödülü zaten alındı, buraya tekrar giriş yapılamaz!");
                        continue;
                    } else {
                        location = new Forest(player);
                    }
                    break;
                case 5:
                    if (player.getInventory().isWater()) {
                        System.out.println("Nehir ödülü zaten alındı, buraya tekrar giriş yapılamaz!");
                        continue;
                    } else {
                        location = new River(player);
                    }
                    break;
                case 6:
                    if (player.getInventory().isMineCleared()) {
                        System.out.println("Maden bölgesi zaten tamamlandı, buraya tekrar giriş yapılamaz.");
                        continue;
                    } else {
                        location = new Mine(player);
                    }
                    break;
                default:
                    System.out.println("Geçerli bir bölge giriniz.");
                    continue;
            }

            if (location == null) {
                System.out.println("Oyundan Cikis Yapildi.");
                return; // Oyun tamamen biter
            }

            if (!location.onLocation()) {
                System.out.println("GAME OVER!!!");
                return; // Oyun tamamen biter
            }

            // Tüm ödüller toplandıysa oyunu kazanma kontrolü
            if (player.getInventory().checkAllItems()) {
                System.out.println("OYUNU KAZANDINIZ !!!!");
                return; // Oyunu tamamen sonlandır
            }
        }
    }
}