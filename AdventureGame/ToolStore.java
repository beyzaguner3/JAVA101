package Adventure;

public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("------ Mağazaya Hosgeldiniz ! ------");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("1- Silahlar");
            System.out.println("2- Zırhlar");
            System.out.println("3- Çıkış Yap");
            System.out.print("Seçiminiz : ");
            int selectCase = input.nextInt();
            while ((selectCase < 1) || (selectCase > 3)) {
                System.out.println("Gecersiz deger , tekrar giriniz : ");
                selectCase = input.nextInt();
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmour();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Tekrar bekleriz");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("------ Silahlar ------");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + "-" + w.getName() +
                    "< Para : " + w.getPrice() + " , Hasar : " + w.getDamage() + ">");
        }
        System.out.println("0 - çıkış yap ");
    }


    public void buyWeapon() {
        System.out.print("Bir silah seciniz : ");
        int selectWeaponID = input.nextInt();
        while ((selectWeaponID < 0) || (selectWeaponID > Weapon.weapons().length)) {
            System.out.println("Gecersiz deger , tekrar giriniz : ");
            selectWeaponID = input.nextInt();
        }

        if (selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);
            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paraniz bulunmamaktadir !");
                } else {
                    System.out.println(selectedWeapon.getName() + "silahını satın aldınız !");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan Bakiye : " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }
            }
        }

    }

    public void printArmour() {
        System.out.println("------ Zırhlar ------");
        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() + "-" + a.getName() +
                    "< Para : " + a.getPrice() + " , Bloklama : " + a.getBlock() + ">");
        }
        System.out.println("0 - çıkış yap");
    }

    public void buyArmor() {
        System.out.print("Bir zırh seciniz : ");
        int selectArmorID = input.nextInt();
        while ((selectArmorID < 0) || (selectArmorID > Armor.armors().length)) {
            System.out.println("Gecersiz deger , tekrar giriniz : ");
            selectArmorID = input.nextInt();
        }


        if (selectArmorID != 0) {
            Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paraniz bulunmamaktadir !");
                } else {
                    System.out.println(selectedArmor.getName() + "zırhını satın alınız !");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedArmor.getPrice());
                    System.out.println("Kalan Bakiye : " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                }
            }
        }
    }
}

