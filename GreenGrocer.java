import java.util.Scanner;
public class GreenGrocer {
    public static void main(String[] args) {
        double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg;
        Scanner input = new Scanner(System.in);

        System.out.print("How many Kilograms Pear? : ");
        pearKg = input.nextDouble();
        double PricePerKgPear = 2.14;
        double TotalPricePear = PricePerKgPear * pearKg;
        System.out.println("Total Price for Pears : " + TotalPricePear);

        System.out.print("How many Kilograms Apple : ");
        appleKg = input.nextDouble();
        double PricePerKgApple = 3.67;
        double TotalPriceApple = appleKg * PricePerKgApple;
        System.out.println("Total Price for Apples : " + TotalPriceApple);

        System.out.print("How many Kilograms Tomato? : ");
        tomatoKg = input.nextDouble();
        double PricePerKgTomato = 1.11;
        double TotalPriceTomato = PricePerKgTomato * tomatoKg;
        System.out.println("Total Price for Tomatoes : " + TotalPriceTomato);

        System.out.print("How many Kilograms Banana? : ");
        bananaKg = input.nextDouble();
        double PricePerKgBanana = 0.95;
        double TotalPriceBanana = PricePerKgBanana * bananaKg;
        System.out.println("Total Price for Bananas : " + TotalPriceBanana);

        System.out.print("How many Kilograms Eggplant? : ");
        eggplantKg = input.nextDouble();
        double PricePerKgEggplant = 5.0;
        double TotalPriceEggplant = PricePerKgEggplant * eggplantKg;
        System.out.println("Total Price for Eggplants : " + TotalPriceEggplant);

        double TotalPrice = TotalPricePear + TotalPriceApple + TotalPriceTomato + TotalPriceBanana + TotalPriceEggplant;
        System.out.println("Total Price : " + TotalPrice);

    }
}
