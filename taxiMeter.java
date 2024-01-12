import java.util.Scanner;
public class taxiMeter {
    public static void main(String[] args) {
        double km, perkm,startPrice, totalPrice;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the Distance in km : ");
        km = inp.nextDouble();

        perkm = 2.20;
        startPrice = 10;
        totalPrice = startPrice + (km * perkm);
        totalPrice = (totalPrice < 20) ? 20 : totalPrice;

        System.out.println("Total Price : " + totalPrice);



    }

}